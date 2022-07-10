object O1 extends App{
    def normalWage(hours:Int):Int={
        hours*250
    }

    def otWage(hours:Int):Int={
        hours*85
    }

    def income(hour1:Int,hour2:Int):Int={
        normalWage(hour1)+otWage(hour2)
    }

    def tax(income:Int):Double={
        income*0.12
    }

    def takeHomeWage(h1:Int,h2:Int):Double={
        income(h1,h2)- tax(income(h1,h2))
    }

    printf("%.2f",takeHomeWage(40,30));
}