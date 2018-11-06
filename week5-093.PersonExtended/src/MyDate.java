public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate comparedDate) {
        int years = 0;
        int buffer, buffer2 = 0;

        years = Math.abs(this.year - comparedDate.year);

        if (this.month > comparedDate.month && this.day > comparedDate.day) {
            return years;
        } else {
            if (years >= 1) {
                if (this.month == comparedDate.month) {
                    if (this.day == comparedDate.day) {
                        return Math.abs(this.year - comparedDate.year);
                    } else {
                        if (this.day < comparedDate.day) {
                            return years - 1;
                        } else {
                            //if(years > 1){
                            return years;
                            //} else {
                            //    return 0;
                            //}

                        }

                    }

                } else {
                    if (this.month > comparedDate.month) {

                        if (this.day > comparedDate.day) {
                            return years - 1;
                        } else {
                            return years - 1;
                        }

                    } else {
                        return years - 1;
                    }
                }
            } else {
                return years;
            }
        }


    }
}