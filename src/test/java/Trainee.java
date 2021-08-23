public class Trainee {
    private int training_id;
    private String firstname;
    private String lastname;
    private String skype;
    private String info;
    private int office_id;

    public Trainee(int training_id, String firstname, String lastname,
                   String skype, String info, int office_id) {
        this.training_id = training_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.skype = skype;
        this.info = info;
        this.office_id = office_id;
    }

    public static class Builder {
        private int training_id;
        private String firstname;
        private String lastname;
        private String skype;
        private String info;
        private int office_id;

        public Builder setTraining_id(int training_id) {
            this.training_id = training_id;
            return this;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setSkype(String skype) {
            this.skype = skype;
            return this;
        }

        public Builder setInfo(String info) {
            this.info = info;
            return this;
        }
        public Builder setOffice_id(int office_id) {
            this.office_id = office_id;
            return this;
        }

        Trainee build()
        {
            return new Trainee(this.training_id, this.firstname, this.lastname,
                    this.skype, this.info, this.office_id);
        }
    }

    // for testing
    public void showMessage()
    {
        System.out.println("Values:  " + this.training_id + this.firstname + this.lastname
                + this.skype + this.info + this.office_id);
    }

    public static void main(String args[])
    {
        Trainee tr = new Trainee.Builder()
                .setTraining_id(7)
                .setFirstname("Stas")
                .build();

        tr.showMessage();
    }
}
