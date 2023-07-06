package exercise;

class Address {
    @NotNull
    @MinLength(minLength = 5)
    private String country;

    @NotNull
    @MinLength(minLength = 6)
    private String city;

    @NotNull
    private String street;

    @NotNull
    private String houseNumber;
    @MinLength
    private String flatNumber;

    Address(String country, String city, String street, String houseNumber, String flatNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
}
