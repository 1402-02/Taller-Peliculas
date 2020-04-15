  package peliculas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Interfaz extends JFrame implements ActionListener{ 
    JPanel p1, p2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bv1,bv2,bv3,bv4,bv5,bv6,bv7,bv8,bv9,bv10,tot;
    JTextArea t1;
    public Interfaz(){
    b1 = new JButton("PELICULA 1");
    b2 = new JButton("PELICULA 2");
    b3 = new JButton("PELICULA 3");
    b4 = new JButton("PELICULA 4");
    b5 = new JButton("PELICULA 5");
    b6 = new JButton("PELICULA 6");
    b7 = new JButton("PELICULA 7");
    b8 = new JButton("PELICULA 8");
    b9 = new JButton("PELICULA 9");
    b10 = new JButton("PELICULA 10");
    t1 = new JTextArea();
    bv1 = new JButton("Vender Boleto");
    tot = new JButton("Total Vendidos");
    t1.setBounds(200, 100, 500, 500);
    setLayout(new BorderLayout());
    setBounds(600,600,600,600);
    p1=new JPanel();
    p1.setBackground(Color.green);
    p1.setLayout(new FlowLayout());
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p1.add(b7);
    p1.add(b8);
    p1.add(b9);
    p1.add(b10);
    p1.add(t1);
    setBounds(600, 600, 600, 300);
    p2 = new JPanel();
    p2.setBackground(Color.green);
    add(p1, BorderLayout.CENTER);
    add(p2, BorderLayout.SOUTH);
    p2.add(bv1);
    p2.add(tot);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    bv1.addActionListener(this);
    tot.addActionListener(this);
    setVisible(true);
    }
    int bol1,bol2, acum=0, acum1=0;
    @Override
    
    public void actionPerformed(ActionEvent ae) {
    Contenido peli1 = new Contenido("Shrek", "Andrew Adamson","Un ogro llamado Shrek vive en su pantano y tiene que rescatar\na la princesa Fiona en compañia de su amigo Burro.", "2001");
    Contenido peli2 = new Contenido("Titanic", "James Cameron","El trasatlántico que se hundió durante su viaje inaugural", "1998");
    Contenido peli3 = new Contenido("Avatar", "James Cameron", "Entramos en el nuevo mundo a través de los ojos de Jake Sully,\nun ex-Marine confinado en una silla de ruedas. Jake ha sido reclutado para viajar a Pandora", "2009");
    Contenido peli4 = new Contenido("Rapidos y Furiosos 8", "Felix Gary Gray", "Dom esta trabajando para una misteriosa mujer.\nTodo el equipo deberá detener a Dom para evitar un desastre mundial,\ny asimismo saber el motivo de su traición.", "2017");
    Contenido peli5 = new Contenido("Coco", "Lee Unkrich,", "Miguel es un joven con el sueño de convertirse en leyenda de la música\na pesar de la prohibición de su familia. Su pasión le llevará a adentrarse\nen la \"Tierra de los Muertos\" para conocer su verdadero legado familiar.", "2017");
    Contenido peli6 = new Contenido("Piratas del caribe: La venganza de salazar", "Joachim Rønning", "El capitán Jack esta pasando por una mala racha,\ncon la sensación de que los vientos de la mala fortuna soplan\nfuertemente en su dirección hacia el aterrador Capitán Salazar ", "2017");
    Contenido peli7 = new Contenido("Furia de titanes", "Louis Leterrier", "'Furia de titanes' es la adaptación al cine del mito de Perseo,\nhijo del dios Zeus. Perseo nació como un dios pero fue criado como un hombre.", "2010");
    Contenido peli8 = new Contenido("Avengers: Endgame", "Joe Russo,", "Después de ser derrotados por Thanos la última vez y\nde que este último efectuara su plan de eliminar a la mitad del universo,\nocasionado por el chasquido del Guantelete del Infinito.", "2019");
    Contenido peli9 = new Contenido("Jumanji", "Jake Kasdan", "En la nueva aventura Jumanji: En la Selva, cuatro adolescentes\nque fueron castigados en la escuela son succionados al mundo de Jumanji.", "2017");
    Contenido peli10 = new Contenido("Acuaman", "James Wan", "Arthur Curry , el renuente gobernante del reino submarino de Atlántida,\nse ve atrapado en una batalla entre habitantes de la superficie\nque amenazan a sus océanos y su propia gente,", "2018");
    ArrayList lista = new ArrayList();
    lista.add(peli1);
    lista.add(peli2);
    lista.add(peli3);
    lista.add(peli4);
    lista.add(peli5);
    lista.add(peli6);
    lista.add(peli7);
    lista.add(peli8);
    lista.add(peli9);
    lista.add(peli10);
        String accion;
        accion = ae.getActionCommand();
        if(accion.equalsIgnoreCase("PELICULA 1")){
            t1.setText(peli1.toString());
        }
        if(accion.equalsIgnoreCase("Vender Boleto")){
            bol1 = Integer.parseInt(JOptionPane.showInputDialog("Cuantos boletos quiere vender: "));
            acum+=bol1;
            System.out.println(acum);
        }
        if(accion.equalsIgnoreCase("PELICULA 2")){
            t1.setText(peli2.toString());
        }
        if(accion.equalsIgnoreCase("PELICULA 3")){
            t1.setText(peli3.toString());
        }
        if(accion.equalsIgnoreCase("PELICULA 4")){
            t1.setText(peli4.toString());
        }
        if(accion.equalsIgnoreCase("PELICULA 5")){
            t1.setText(peli5.toString());
        }
        if(accion.equalsIgnoreCase("PELICULA 6")){
            t1.setText(peli6.toString());
        }
        if(accion.equalsIgnoreCase("PELICULA 7")){
            t1.setText(peli7.toString());
        }
        if(accion.equalsIgnoreCase("PELICULA 8")){
            t1.setText(peli8.toString());
        }
        if(accion.equalsIgnoreCase("PELICULA 9")){
            t1.setText(peli9.toString());
        }
        if(accion.equalsIgnoreCase("PELICULA 10")){
            t1.setText(peli10.toString());
        }
        if (accion.equalsIgnoreCase("Total Vendidos")) {
            JOptionPane.showMessageDialog(null,"El total de boletos vendidos fue: "+acum);
        }
    }
}
