
package extra06;

import java.util.Date;

public class Extra06 {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Gato g = new Gato(2,"Macho",70.f,"Ariel",4,false,"cinza");
        g.status();
        g.locomocao();
        g.adoucr();
        
       Leao l = new Leao(false,7,"Femea",130.f,"Nala",4,false,"branco");
       l.status();
       l.alimentar();
       l.locomocao();
       l.miado();
       l.juba();
       
    }
    
}
