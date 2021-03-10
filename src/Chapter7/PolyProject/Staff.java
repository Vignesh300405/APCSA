package Chapter7.PolyProject;

public class Staff {

    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[11];

        staffList[0] = new Executive("Mr. Hatcher", "123 Main Street", "111-1111", "111-111-1111", 100000);
        staffList[1] = new Employee("Ms. Xie", "222 Main Street", "222-2222", "222-222-2222", 65000);
        staffList[2] = new Employee("Mr. Ruppel", "333 Main Street", "333-3333", "333-333-3333", 45000);
        staffList[3] = new Hourly("Mr. Niverthi", "444 Main Street", "444-4444", "444-444-4444", 10);
        staffList[4] = new Hourly("Mr. Gokare", "555 Main Street", "555-5555", "555-555-5555", 12);
        staffList[5] = new Commission("Mr. Pujari", "666 Main Street", "666-6666", "666-666-6666", 75000);
        staffList[6] = new Commission("Mr. Juang", "777 Main Street", "777-7777", "777-777-7777", 125000);
        staffList[7] = new Volunteer("Mrs. McClelland", "888 Main Street", "888-8888");
        staffList[8] = new Volunteer("Mr. Sanchez", "999 Main Street", "999-9999");
        staffList[9] = new Commission("Ms. Petry", "1000 Main Street", "100-0000", "100-000-0000", 85000);
        staffList[10] = new Employee("Mr. Suresh Kumar", "111 Main Street", "123-1234", "123-123-1234", 85000);

        ((Executive)staffList[0]).awardBonus(25000);
        ((Hourly)staffList[3]).addHours(41);
        ((Hourly)staffList[4]).addHours(38);
        ((Commission)staffList[5]).addCommission(1500);
        ((Commission)staffList[6]).addCommission(12000);
        ((Commission)staffList[9]).addCommission(1000);
    }

    
}
