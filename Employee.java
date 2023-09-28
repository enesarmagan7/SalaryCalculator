package Week2;

public class Employee {
    //Degiskenlerin tanimlanmasi
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name,double salary,int workHours, int hireYear){    // Contructor tanımlanması
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax(){     // Tax metodu vergi hesaplar. Maaş 1000 den büyükse maaşın %3 miktarı vergi hesaplar.
        double taxSalary=0;
    if(salary>1000){
         taxSalary=this.salary*0.03;

            }
    return taxSalary;
    }
    public double bonus(){       //Çalışma saatine göre bonus miktarını hesaplar. 40 saatten sonraki her saat başına 30 Tl hesaplar.
        double bonusSalary=0;
       if(this.workHours>40){
           bonusSalary=(workHours-40)*30;
       }
       return bonusSalary;
    }
    public double raiseSalary(){
        //Çalışma yılına göre maaaş artışı hesaplar. 10 seneden az çalışana %5, 9 ile 20 yıl arasına %10,
        // 19 yıldan fazla çalışana %15 zam hesaplar.
        int workedTime=2021-this.hireYear;
        double raiseAmount=0;
        if(workedTime<10){
            raiseAmount=this.salary*(0.05);

        }else if(workedTime>9 && workedTime<20){
            raiseAmount=this.salary*(0.1);
        } else if(workedTime>19){
            raiseAmount=this.salary*(0.15);
        }
     return raiseAmount;
    }
    public String toString(){
     //Çalışan bilgilerinin ekrana bastırılması.
        System.out.println("Adı: "+ this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+ tax());
        System.out.println("Bonus: "+ bonus());
        System.out.println("Maaş Artışı: "+ raiseSalary());
        double salaryAmount= this.salary+bonus()+raiseSalary()-tax();
        System.out.println("Vergi ve bonuslarla birlikte maaş: "+ (salaryAmount-raiseSalary()));
        System.out.println("Toplam maaş: "+ salaryAmount);
       return "Çalışan Bilgileri";
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Kemal", 2000, 45, 1985);
        employee.toString();
    }
}


