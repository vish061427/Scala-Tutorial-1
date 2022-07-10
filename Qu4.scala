import scala.io.StdIn.readInt;
object O2 extends App{
    def revenue(ticketPrice:Int,attendees:Int):Int={
        ticketPrice*attendees;
    }

    def changeOfAttendence(ticketPrice:Int):Int={
        if(ticketPrice < 15)
        {
            return (((15-ticketPrice)/5)*20)
        }
        else if(ticketPrice > 15)
        {
            return (((ticketPrice-15)/5) * (-20))
        }
        else
            return 0;
    }

    def cost(attendees:Int,ticketPrice:Int):Int={
        500+(3*(attendees+changeOfAttendence(ticketPrice)))
    }

    def profit(ticketPrice:Int,attendees:Int):Int={
        revenue(ticketPrice,(attendees+changeOfAttendence(ticketPrice)))-cost(attendees,ticketPrice);
    }

    println("Enter Ticket price:");
    var tPrice = readInt()
    println("Profit related to the ticket price: "+profit(tPrice,120));
}