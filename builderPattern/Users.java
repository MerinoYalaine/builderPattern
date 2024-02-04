package builderPattern;

public class Users {

    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final Integer age;

    private Users(UsersBuilder builder) {

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.email = builder.email;
        this.phone = builder.phone;
        this.age = builder.age;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    protected static class UsersBuilder{

        private String firstName;
        private String lastName;
        private String address;
        private String email;

        private String phone;

        private Integer age;

        public UsersBuilder firstName(String firstName){

            this.firstName = firstName;
            return this;

        }

        public UsersBuilder lastName(String lastName){

            this.lastName = lastName;
            return this;

        }

        public UsersBuilder address(String address){

            this.address = address;
            return this;

        }

        public UsersBuilder email(String email){

            this.email = email;
            return this;

        }

        public UsersBuilder phone(String phone){

            this.phone = phone;
            return this;

        }

        public UsersBuilder age(Integer age){

            this.age = age;
            return this;

        }

        public Users build(){

            return new Users(this);

        }

    }

}
