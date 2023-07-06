package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validator {
    public static List<String> validate(Address address) {

        List<String> invalidFields = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    if (field.get(address) == null) {
                        invalidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return invalidFields;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> invalidFields = new HashMap<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String fieldName = field.getName();
            List<String> errorMessages = new ArrayList<>();

            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    if (field.get(address) == null) {
                        errorMessages.add("can not be null");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            if (field.isAnnotationPresent(MinLength.class)) {
                MinLength minLengthAnnotation = field.getAnnotation(MinLength.class);
                int minLength = minLengthAnnotation.minLength();
                try {
                    String value = (String) field.get(address);
                    if (value != null && value.length() < minLength) {
                        errorMessages.add("length less than " + minLength);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            if (!errorMessages.isEmpty()) {
                invalidFields.put(fieldName, errorMessages);
            }
        }

        return invalidFields;
    }
}
