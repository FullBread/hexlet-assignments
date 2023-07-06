package exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Map;



class ValidationTest {

    @Test
    void testValidate() {
        Address address1 = new Address("Russia", "Ufa", "Lenina", "54", null);
        List<String> result1 = Validator.validate(address1);
        List<String> expected1 = List.of();
        assertThat(result1).isEqualTo(expected1);

        Address address2 = new Address(null, "London", "1-st street", "5", "1");
        List<String> result2 = Validator.validate(address2);
        List<String> expected2 = List.of("country");
        assertThat(result2).isEqualTo(expected2);

        Address address3 = new Address("USA", null, null, null, "1");
        List<String> result3 = Validator.validate(address3);
        List<String> expected3 = List.of("city", "street", "houseNumber");
        assertThat(result3).isEqualTo(expected3);
    }
    @Test
    void testWithValidAddress() {
        Address address = new Address("Country", "CityName", "StreetName",
                "123", "Flat");
        Map<String, List<String>> validationErrors = Validator.advancedValidate(address);
        Assertions.assertTrue(validationErrors.isEmpty(), "Validation errors should be empty");
    }

    @Test
    void testWithInvalidAddress() {
        Address address = new Address(null, "City", "Str", "12", null);
        Map<String, List<String>> validationErrors = Validator.advancedValidate(address);
        Assertions.assertFalse(validationErrors.isEmpty(), "Validation errors should not be empty");
        List<String> errorMassage1 = List.of("can not be null");
        List<String> errorMassage2 = List.of("length less than 6");

        Assertions.assertTrue(validationErrors.containsKey("country"),
                "Validation errors should contain 'country' field");
        Assertions.assertTrue(validationErrors.containsKey("city"),
                "Validation errors should contain 'city' field");
        Assertions.assertFalse(validationErrors.containsKey("street"),
                "Validation errors should contain 'street' field");
        Assertions.assertFalse(validationErrors.containsKey("houseNumber"),
                "Validation errors should contain 'houseNumber' field");
        Assertions.assertFalse(validationErrors.containsKey("flatNumber"),
                "Validation errors should contain 'flatNumber' field");

        List<String> countryErrors = validationErrors.get("country");
        assertThat(countryErrors).isEqualTo(errorMassage1);


        List<String> cityErrors = validationErrors.get("city");
        assertThat(cityErrors).isEqualTo(errorMassage2);
    }
}
