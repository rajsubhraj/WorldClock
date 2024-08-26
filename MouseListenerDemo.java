/* Time of Different countries
US
Aus
China
India
japan
algeria
japan
france
canada
Russia
Brazil

*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import java.util.*;






class MouseListenerDemo
{
    static public void main(String [] subh)
    {
        JFrame f = new JFrame("World Clock");
        f.setSize(1150, 760);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);





        JLabel l = new JLabel("Location of Mouse",      JLabel.CENTER);
        f.add(l, BorderLayout.NORTH);
        l.setFont(new Font(Font.SERIF, 3, 36));

        JLabel jl = new JLabel(new ImageIcon(MouseListenerDemo.class.getResource("/map.png")));

        f.add(jl);

        class MyListener extends MouseAdapter
        {
            int x;
            int y, clicks;
            public void mouseMoved(MouseEvent m)
            {
                x = m.getX();
                y = m.getY();
                l.setText(x +", "+ y);
                // country 1
                if((x>= 750 && x <=810) && (y<=480 && y >= 400))   //India
                {
                    ZoneId z = ZoneId.of("Asia/Calcutta");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to India. Time is: "+ t);
                }

                // country
                else if((x>= 150 && x<=300)&&(y<=400 && y>=350)) // usa
                {

                    ZoneId z  = ZoneId.of("US/Pacific");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to U.S.A. Time is:"+ t);

                }

                // country 3
                else if((x>= 800 && x<=900)&&(y<=420 && y>=370)) //china
                {

                    ZoneId z  = ZoneId.of("Asia/Shanghai");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to China. Time is:"+ t);

                }

                // country 4
                else if((x>= 650 && x<=1030)&&(y<=330 && y>=180)) //Russia
                {

                    ZoneId z  = ZoneId.of("Europe/Moscow");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Russia. Time is:"+ t);

                }

                // country 5
                else if((x>= 900 && x<=1010)&&(y<=620 && y>=560)) //Australia
                {

                    ZoneId z  = ZoneId.of("Australia/Lindeman");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Australia. Time is:"+ t);

                }

                // country 6
                else if((x>= 100 && x<=310)&&(y<=340 && y>=210)) //Canada
                {

                    ZoneId z  = ZoneId.of("Canada/Pacific");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Canada. Time is:"+ t);

                }

                // country 7
                else if((x>= 319 && x<= 430)&&(y<=600 && y>=510)) //Brazil
                {

                    ZoneId z  = ZoneId.of("Brazil/DeNoronha");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Brazil. Time is:"+ t);

                }

                // country 8
                else if((x>= 950 && x<= 1000)&&(y<=415 && y>=367)) //japan
                {

                    ZoneId z  = ZoneId.of("Asia/Tokyo");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Japan. Time is:"+ t);

                }

                // country 9
                else if((x>= 626 && x<= 675)&&(y<=399 && y>=377)) //Turkey
                {

                    ZoneId z  = ZoneId.of("Asia/Istanbul");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Turkey. Time is:"+ t);

                }

                // country 10
                else if((x>= 531 && x<= 555)&&(y<=394 && y>=335)) //france
                {

                    ZoneId z  = ZoneId.of("Europe/Paris");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to France. Time is:"+ t);

                }

                // country 11
                else if((x>= 515 && x<= 567)&&(y<=453&& y>=398)) //Algeria
                {

                    ZoneId z  = ZoneId.of("Africa/Algiers");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Algeria. Time is:"+ t);

                }

                // country 12
                else if((x>= 510 && x<= 540)&&(y<=333 && y>=292)) //Uk
                {

                    ZoneId z  = ZoneId.of("Europe/London");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to U.K. Time is:"+ t);

                }

                // country 13
                else if((x>= 685 && x<= 730)&&(y<=430 && y>=390)) //Iran
                {

                    ZoneId z  = ZoneId.of("Asia/Tehran");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Iran. Time is:"+ t);

                }

                // country 14
                else if((x>= 514 && x<= 519)&&(y<=396 && y>=370)) //Portugal
                {

                    ZoneId z  = ZoneId.of("Europe/Lisbon");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Portugal. Time is:"+ t);

                }

                // country 14
                else if((x>= 514 && x<= 519)&&(y<=396 && y>=370)) //Portugal
                {

                    ZoneId z  = ZoneId.of("Europe/Lisbon");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Portugal. Time is:"+ t);

                }

                // country 15
                else if((x>= 618 && x<= 642)&&(y<=445 && y>=419)) //Egypt
                {

                    ZoneId z  = ZoneId.of("Egypt");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Egypt. Time is:"+ t);

                }

                // country 16
                else if((x>= 467 && x<= 495)&&(y<=259 && y>=243)) //Iceland
                {

                    ZoneId z  = ZoneId.of("Iceland");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Iceland. Time is:"+ t);

                }


                // country 17
                else if((x>= 587 && x<= 610)&&(y<=338 && y>=316)) //Poland
                {

                    ZoneId z  = ZoneId.of("Poland");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Poland. Time is:"+ t);

                }


                // country 18
                else if((x>= 322 && x<= 360)&&(y<=710 && y>=604)) //Argentina
                {

                    ZoneId z  = ZoneId.of("America/Buenos_Aires");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Argentina. Time is:"+ t);

                }

                // country 19
                else if((x>= 702 && x<= 713)&&(y<=445 && y>=440)) //UAE
                {

                    ZoneId z  = ZoneId.of("Asia/Dubai");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to U.A.E. Time is:"+ t);
                }

                // country 20
                else if((x>= 570 && x<= 615)&&(y<=451 && y>=418)) //Libya
                {

                    ZoneId z  = ZoneId.of("Libya");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Libya. Time is:"+ t);
                }

                // country 21
                else if((x>= 329 && x<= 470)&&(y<=280 && y>=106)) //Greenland
                {

                    ZoneId z  = ZoneId.of("Europe/Copenhagen");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Greenland. Time is:"+ t);
                }



                // country 22
                else if((x>= 178 && x<= 236)&&(y<=473 && y>=429)) //Mexico
                {

                    ZoneId z  = ZoneId.of("America/Mexico_City");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Mexico. Time is:"+ t);
                }

                //country 23
                else if((x>= 585 && x<= 614)&&(y<= 344&& y>=315))
                {

                    ZoneId z  = ZoneId.of("Poland  Poland");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Poland. Time is:"+ t);
                }


                //country 24
                else if((x>= 610 && x<= 660)&&(y<= 361&& y>=336))
                {

                    ZoneId z  = ZoneId.of("Europe/Kiev");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Ukraine. Time is:"+ t);
                }

                //country 24
                else if((x>= 610 && x<= 660)&&(y<= 361&& y>=336))
                {

                    ZoneId z  = ZoneId.of("Europe/Kiev");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Ukraine. Time is:"+ t);
                }


                //country 25
                else if((x>= 593 && x<= 630)&&(y<= 632 && y>=610))
                {

                    ZoneId z  = ZoneId.of("Africa/Johannesburg");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to South Africa. Time is:"+ t);
                }


                //country 26
                else if((x>= 810 && x<= 910)&&(y<= 370 && y>= 330))
                {

                    ZoneId z  = ZoneId.of("Asia/Hovd");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Mongolia. Time is:"+ t);
                }

                //country 27
                else if((x>= 689 && x<= 804)&&(y<= 382 && y>= 337))
                {

                    ZoneId z  = ZoneId.of("Asia/Oral");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Kazakhstan. Time is:"+ t);
                }

                //country 28
                else if((x>= 574 && x<= 600)&&(y<= 612 && y>= 579))
                {

                    ZoneId z  = ZoneId.of("Africa/Windhoek");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Nambia. Time is:"+ t);
                }

                //country 29
                else if((x>= 1060 && x<= 1100)&&(y<= 696 && y>= 639))
                {

                    ZoneId z  = ZoneId.of("Pacific/Auckland");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to New Zealand. Time is:"+ t);
                }

                //country 30
                else if((x>= 589 && x<= 630)&&(y<= 558 && y>= 511))
                {

                    ZoneId z  = ZoneId.of("Africa/Brazzaville");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Rep. of congo . Time is:"+ t);
                }


                //country 31
                else if((x>= 579 && x<= 600)&&(y<= 315 && y>= 228))
                {

                    ZoneId z  = ZoneId.of("Europe/Stockholm");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Sweden . Time is:"+ t);
                }




                //country 32
                else if((x>= 614 && x<= 633)&&(y<= 285 && y>= 215))
                {

                    ZoneId z  = ZoneId.of("Europe/Helsinki");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Finland . Time is:"+ t);
                }


            }



            public void mouseClicked(MouseEvent m)
            {
                clicks = m.getClickCount();
                System.out.println("Clicked");
                System.out.println(clicks + " times clicked");
            }
            public void mousePressed(MouseEvent m)
            {
                System.out.println("Pressed");
            }
            public void mouseReleased(MouseEvent m)
            {
                System.out.println("Released");

            }
        }


        MyListener ml = new MyListener();
        f.addMouseMotionListener(ml);
        f.addMouseListener(ml);
        f.setVisible(true);

    }
}
class FindZoneId
{
    public static void main (String [] rk)
    {
        Set <String> zones = ZoneId.getAvailableZoneIds();
        for(String s: zones)
        {
            ZoneId z = ZoneId.of(s);
            System.out.println(s + "\t" + z);
        }

    }
}



