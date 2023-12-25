package Currensiens;

public class Сurrencies {
    public enum Currency {
        INR("rupee", 1.0),
        USD("dollar", 62.0),
        GBP("pound", 85.86),
        EUR("euro", 76.71),
        YEN("yen", 1.74);

        private double rupeeConversionRate;
        private String fullName;

        private Currency(String fullName, double rupeeConversionRate) {
            this.rupeeConversionRate = rupeeConversionRate;
            this.fullName = fullName;
        }

        public double getRupeeConversionRate() {
            return this.rupeeConversionRate;
        }

        public String getFullName() {
            return this.fullName;
        }

        public String getShortName() {
            return this.name();
        }

    }
}
