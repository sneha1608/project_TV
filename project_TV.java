import java.io.*;
public class project_tv
{
    
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
            
            String time[]={"1)1am-2am","2)2am-3pm","3)3am-4am","4)4am-5am","5)5am-6am","6)6am-7am","7)7am-8am","8)8am-9am","9)9am-10am","10)10am-11am","11)11am-12 noon",
                           "12)12 noon-1pm","13)1pm-2pm","14)2pm-3pm","15)3pm-4pm","16)4pm-5pm","17)5pm-6pn","18)6pm-7pm","19)7pm-8pm","20)8pm-9pm","21)9pm-10pm","22)10pm-11pm",
                           "23)11pm-12midnigh","24)12 midnight-1am"};
            String a[]={"ICC cricket world","WWE Smack Down","UEFA champions league","ATP 500 series","football league","India vs Pakistan Highlights","ICC cricket world",
                        "WWE Smack Down","UEFA champions league","ATP 500 series","football league","India vs Pakistan Highlights","ICC cricket world","WWE Smack Down","UEFA champions                              league","ATP 500 series","football league","India vs Pakistan Highlights","ICC cricket world",
                        "WWE Smack Down","UEFA champions league","ATP 500 series","football league","India vs Pakistan Highlights"};
            String b[]={"cricket centre","Playback","Super League","Ballebazz","Tennis","La liga","cricket centre","Playback","Super League","Ballebazz","Tennis",
                        "La liga","cricket centre","Playback","Super League","Ballebazz","Tennis","La liga","cricket centre","Playback","Super League","Ballebazz","Tennis","La liga"};
            String c[]={"oggy and the coackroaches","spongebob squarepants","blues clues","ninja hattori","sharko","kiteretsu","oggy and the coackroaches","spongebob squarepants","blues                                clues","ninja hattori","zig and sharko","kiteretsu","powerpuff girls","tom and jerry","barney","beyblade","pokemon","adams family",
                        "spongebob squarepants","blues clues","ninja hattori","sharko","barney","Tom and Jerry"};
            String d[]={"doraemon","kid vs cat","shin chan","kick batoski","chotta bheem","art attack","doraemon","Phineas and ferb","chicken stew","Power Rangers","Keymon ache","Penguins of                          madagascar","Pick a Trick","Phineas and ferb","chicken stew","Power Rangers","Keymon ache","Penguins of madagascar","Pick a Trick","kid vs cat","shin chan","kick                                    batoski","chotta bheem","art attack"}; 
            String e[]={"Top ten","Hit factory","Play list","Mix tape","Rock rules","Hand picked","jersey shore","Vh1 Legends","Vh1 Late Night","South Park","hip hop hustle","Sing off",
                        "Top ten","Hit factory","Play list","Mix tape","Rock rules","Hand picked","jersey shore","Vh1 Legends","Vh1 Late Night","South Park","hip hop hustle","Sing off"};
            String f[]={"prime time bakwas","unplugged","v spot","extreme trail","axe your x","trailors","D code","Good morning","Music express","house of style","Rodies","Non stop hits","big bang                         mornings", "Prime time bakwas","unplugged","v spot","extreme trail","axe your x","trailors","D code","Good morning","Music express","house of style","Rodies","Non stop                                 hits","big bang mornings"};
            String g[]={"nigela's kitchen","Man vs food","culinary asia","Vicky goes veg","Food and culture","The amazing race","Living with a superstar","Taste of India","Samantha Browns journey                         to mideast","Spooks","The India Calling","Hell's kitchen","nigela's kitchen","Man vs food","culinary asia","Vicky goes veg","Food and culture","The amazing race","Living with a                         superstar","Taste of India","Samantha Browns journey to mideast","Spooks","The India Calling","Hell's kitchen"};
            String h[]={"Friends","Masterchef Australia","The Simpsons","The family guy","Two and a half men","Melissa and joey","Rules of Engagement","Home Improvement","Criminal                                       minds","Bones","Dexter","CSI:Miami","Friends","Masterchef Australia","The Simpsons","The family guy","Two and a half men","Melissa and joey","Rules of Engagement","Home                         Improvement","Criminal minds","Bones","Dexter","CSI:Miami"};
            String j[]={"World Report","Inside the midle east","Worlds untold stories","News @ 10","World report","NEWS","News daily","Forbes","The world-Today Tomorrow","High Tech                                         Engineering","The believable","News @ 9","World Report","Inside the midle east","Worlds untold stories","News @ 10","World report","NEWS","News daily","Forbes",
                         "The world-Today Tomorrow","High Tech Engineering","The believable","News @ 9"};
            String k[]={"International Agenda","Primetime","Mumbai Central","Glamour Show","Khabhar India","Namaste India","Good Morning India","Yeh hai india","Profit India","Money                                        India","Walk the Talk","Big Senders","International Agenda","Primetime","Mumbai Central","Glamour Show","Khabhar India","Namaste India","Good Morning India","Yeh hai                               india","Profit India","Money India","Walk the Talk","Big Senders"};
            String l[]={"Partner","Life Partner","Race","Tellishopping","taare zameen par","Boothnath","IIFA Filmafare Awarda 2011","MR.India","Bewaffa se Waffa","Extra shots","Deewana","Hari                        	 puttar","Partner","Life Partner","Race","Tellishopping","taare zameen par","Boothnath","IIFA Filmafare Awarda 2011","MR.India","Bewaffa se Waffa","Extra                                   		shots","Deewana","Hari puttar"};
            String m[]={"phulwa","Parichay","Uttaran","Bigg Boss","Emotional attiyachar","Balikka Vadhu","Home shop 18","Telebrands","Laado","Khatron ke khiladi","Superstud","Teleshopping",
                            "phulwa","Parichay","Uttaran","Bigg Boss","Emotional attiyachar","Balikka Vadhu","Home shop 18","Telebrands","Laado","Khatron ke khiladi","Superstud","Teleshopping"};  
            String y[]={"Home alone","Grown ups","The sweetest little thing","Tellishopping","Hollywood buzz","The pacifier","Rush hour","Titanic","Bourne ultimatum","Europe Music                           		 awards","Identity","Charlie's angels","Van helsing","Slumdog millionare","Die hard 4.0","The greatest game ver palyed","Robocop","Filler","Shutter","Grudge",
                           "Bad boys 2","The nutcracker","Spider man-3","Buddy"};
            String o[]={"Anaconda-III","Godzilla","Rocky Balboa","Superman","2012","The fugitive","Conspiracy theory","Telebrands","The ring","Scream IV","Final Destination","Gone with the wind",
                           "Fatal attraction","Face off","National treasure","Hostel","New moon","UP","Home shop 18","Megamind","Iron man","Iron man II","Spider-man II","Teleshopping"};                
            String p[]={"movie-sindhu bhairavi","chellamay","idhayam","Tellishopping","","Comedy time","Siri Siri","Songs","Ghajini","News","Stars special","Putham Pudhusu",
                          "enthiran","News","selvam","selvi","Telebuy","Pokkiri","IIFA Filmafare Awards 2011","Run","","Extra shots","Special interview","Kaadhal"};
            String q[]={"Singham","Morning talkshow","Dance Dance","Sun TV hits","Movie-Moonram pirai","News","Dasavatharam","Just For Kids","Quiz time","Raasi","putham                                                    phudusa","Teleshopping","Sunt TV Talent Search","Parashakti","Star Singers","Aniyan","Crime","Telebuy","Home shop 18","Telebrands","Party night","News","News                          After","Song-Super hits"};
            String r[]={"Morning show","chellamay","idhayam","Tellishopping","Kasturi ","Comedy time","Siri Siri","Songs","Ghajini","News","Stars special","Putham Pudhusu",
                          "enthiran","News","selvam","selvi","Telebuy","Pokkiri","IIFA Filmafare Awards 2011","Run","Thendral ","Extra shots","Special interview","Kaadhal"};
            String u[]={"Singham","Morning talkshow","Dance Dance","Sun TV hits","Movie-Moonram pirai","News","Dasavatharam","Just For Kids","Quiz time","Raasi","Afternoon                                                  Talkshow","Teleshopping", "Sunt TV Talent Search","Parashakti","Star Singers","Aniyan","Crime","Telebuy","Home shop 18","Telebrands","Party night","News","News                                      After","Song-Super hits"};
            String v[]={"Suprabadham","Breakfast news","Devageetham","Tellishopping","Star Singer","Comedy time","Dance Dance","Songs","Adukala","News","Devimahatyam","Harichandanam",
                          "Amma killi","Food path","Movie-Punjabi house","Kitchen house","telebuy","Footh path","IIFA Filmafare Awards 2011","Devi mahatyam","News","Extra shots","Special                          		interview","Kaadhal"};
            String w[]={"Surya prabhadam","Adipoli swad","Dance Dance","Tea time thamasha","Movie-hitler","Sindhooram","Golden five","Swamiye Saran Ayyapa","Quiz                          				time","Avakashikal","Snehakoodu","shopping", "ree krishnan","Parashakti","Star Singers","Aniyan","Crime","Telebuy","Home shop 18","Telebrands","Party 					night","News","News After","Song-Super hits"};
            int i,n,t,s,tm,ans;
            void main()throws IOException
            {
            System.out.println("Enter your name");
            String str=br.readLine();
            System.out.println("Hi "+str+" welcome to sky channel ");
            System.out.println("enter 1 for tv channels menu");
            System.out.println("Enter 2 for online booking");
            System.out.println("Enter 3 for searching programs at a particular time");
            System.out.println("enter 4 for games");
            int z=Integer.parseInt(br.readLine());
            switch(z)
            {
                
                case 1:
                project_tv channel=new project_tv();
                channel.sports();
                channel.cartoon();
                channel.music();
                channel.entertainment();
                channel.news();
                channel.regional();
                break;
                case 2:
                project_tv online=new project_tv();
                online.book();
                break;
                case 3:
                project_tv search=new project_tv();
                search.program();
                break;
                case 4:
                project_tv game=new project_tv();
                game.play();
                break;
            }
        }
        
        
        
        void sports()throws IOException
        {
            System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
            System.out.println("Enter 1 for Ten Sports or Enter 2 for NEO Sports");
            int n=Integer.parseInt(br.readLine());
            if(n==1)
            {
                System.out.println("The programs running in Ten Sports are- ");
                for(int i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+a[i]);
                }
                
            }
            else
            {
                System.out.println("The programs running in NEO Sports are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+b[i]);
                }
            }
        }
       
        void cartoon()throws IOException
        {
            System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
            System.out.println("enetr 1 for nick or enter 2 for disney");
            int n=Integer.parseInt(br.readLine());
            if(n==1)
            {
                System.out.println("The programs running in Nick are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+c[i]);
                }
            }
            else
            {
                System.out.println("The programs running in Disney are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+d[i]);
                }
            }
        }
       
        void music()throws IOException
        {
            System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
            System.out.println("enetr 1 for VH1 or enter 2 for 9XM");
            int n=Integer.parseInt(br.readLine());     
            if(n==1)
            {
                System.out.println("The programs running in VH1 are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+e[i]);
                }
            }
            else
            {
                System.out.println("The programs running in 9XM are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+f[i]);
                }
            }
        } 
        
        void entertainment()throws IOException
        {
            System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
            System.out.println("enter 1 for TLC or enter 2 for Star World");
            int n=Integer.parseInt(br.readLine());     
            if(n==1)
            { 
                System.out.println("The programs running in TLC are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+g[i]);
                }
            }
            else
            {
                System.out.println("The programs running in Star World are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+h[i]);
                }
            }
        } 
       
        void news()throws IOException
        {      
            System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
            System.out.println("enter 1 for CNN or enter 2 for NDTV");
            int n=Integer.parseInt(br.readLine());     
            if(n==1)
            { 
                System.out.println("The programs running in CNN are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+j[i]);
                }
            }
            else
            {
                System.out.println("The programs running in NDTV are-");
                for(i=0;i<24;i++)
                {
                    
                    System.out.println(time[i]+"-"+k[i]);
                }
            }
        }    
        
        void regional()throws IOException
        {
            System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");         
            System.out.println("enter 1 for Hindi");
            System.out.println("enter 2 for English");
            System.out.println("enter 3 for Tamil");
            System.out.println("enter 4 for Malayalam");
            int n=Integer.parseInt(br.readLine());
            if(n==1)
            {
                System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
                System.out.println("enter 1 for MAX or enter 2 for COLOURS");
                int s=Integer.parseInt(br.readLine());     
                if(s==1)
                { 
                    System.out.println("The programs running in MAX are-");
                    for(i=0;i<24;i++)
                    {
                    System.out.println(time[i]+"-"+l[i]);
                    }
                }
                else
                {
                    System.out.println("The programs running in COLOURS are-");
                    for(i=0;i<24;i++)
                    {
                    System.out.println(time[i]+"-"+m[i]);
                    }
                }
            }
            else if(n==2)
            {
               System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
               System.out.println("enter 1 for PIX or enter 2 for HBO");
               int s=Integer.parseInt(br.readLine());     
               if(s==1)
               { 
                   System.out.println("The programs running in PIX are-");
                   for(i=0;i<24;i++)
                   {
                    System.out.println(time[i]+"-"+y[i]);
                   }
               }
               else
               {
                   System.out.println("The programs running in HBO are-");
                   for(i=0;i<24;i++)
                   {
                    System.out.println(time[i]+"-"+o[i]);
                   }
               }
            }
           else if(n==3)
           {
              System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
              System.out.println("enter 1 for Jaya TV or enter 2 for Sun TV  ");
              int s=Integer.parseInt(br.readLine());     
              if(s==1)
              { 
                  System.out.println("The programs running in Jaya TV are-");
                  for(i=0;i<24;i++)
                  {
                    System.out.println(time[i]+"-"+p[i]);
                  }
              }
              else
              {
                  System.out.println("The programs running in Sun TV are-");
                  for(i=0;i<24;i++)
                  {
                    System.out.println(time[i]+"-"+q[i]);
                  }
              }
           }
           else if(n==4)
           {
              System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
              System.out.println("enter 1 for Udaya or enter 2 for ETV Kannada");
              int s=Integer.parseInt(br.readLine());     
              if(s==1)
              { 
                System.out.println("The programs running in Udaya are-");
                for(i=0;i<24;i++)
                {
                    System.out.println(time[i]+"-"+r[i]);
                }
              }
              else
              {
                System.out.println("The programs running in ETV Kannada are-");
                for(i=0;i<24;i++)
                {
                     System.out.println(time[i]+"-"+u[i]);
                }
              }
           }
           else if(n==5)
           {
              System.out.println("*****~~~~~~~~~~~~~~~~~~~~~~******");
              System.out.println("enetr 1 for Jaya TV or enter 2 for Sun TV  ");
              n=Integer.parseInt(br.readLine());     
              if(n==1)
              { 
                System.out.println("The programs running in Asianet are-");
                for(i=0;i<24;i++)
                {
                    System.out.println(time[i]+"-"+v[i]);
                }
              }
              else
              {
                System.out.println("The programs running in Surya are-");
                for(i=0;i<24;i++)
                {
                    System.out.println(time[i]+"-"+w[i]);
                }
              }
           }
           
        System.out.println("~~~~~~THANK YOU~~~~~~");
        }           
        void book()throws IOException
        {
                    System.out.println("The movies running now are:");
                    System.out.println("HINDI: Body Guard ; Ra.One ; Rock Star ");
                    System.out.println("ENGLISH: Tintin ; Immortal ; Abduction ; Breaking Dawn");
                    System.out.println("TELUU: Dookudu ; Seventh Sense  "); 
                    System.out.println("TAMIL: 7aum arivu ; Velayudham; pookiri");
                    System.out.println("MALAYALAM: Subha Rasi ; Oddigayul ; ");
                    System.out.println("Enter 1 for Hindi,2 for English,3 for Tamil,4 for Malayalam");
                    System.out.println("Enter your choice");
                    int t=Integer.parseInt(br.readLine());
                    switch(t)
                    {
                        case 1:
                        System.out.println("Enter 1 for Body Guard ; 2 for Ra.one ; 3 for Rock Star");
                        tm=Integer.parseInt(br.readLine());
                        if(tm==1)
                        System.out.println("Money to be paid is : 250 RS ");
                        if(tm==2)
                        System.out.println("Money to be paid is : 300 Rs");
                        if(tm==3)
                        System.out.println("Money to be paid is : 150 Rs");
                        break;
                        case 2:
                        System.out.println("Enter 1 for Tintin ; 2 for Immortal ; 3 for Abduction ; 4 for Breaking Dawn");
                        tm=Integer.parseInt(br.readLine());
                        if(tm==1)
                        System.out.println("Money to be paid is : 300 Rs");
                        if(tm==2)
                        System.out.println("Money to be paid is : 300 RS");
                        if(tm==3)
                        System.out.println("Money to be paid is : 150 RS");
                        if(tm==4)
                        System.out.println("Money to be paid is : 250 RS ");
                        break;
                        case 3:
                        System.out.println("Enter 1 for Dookudu ; 2 for Seventh Sense");
                        tm=Integer.parseInt(br.readLine());
                        if(tm==1)
                        System.out.println("Money to be paid is : 75 Rs");
                        if(tm==2)
                        System.out.println("Money to be paid is : 350 Rs");
                        break;
                        case 4:
                        System.out.println("Enter 1 for 7aum arivu ; 2 for Velayudham ; 3 for pokiri");
                        tm=Integer.parseInt(br.readLine());
                        if(tm==1)
                        System.out.println("Money to be paid is : 250 RS ");
                        if(tm==2)
                        System.out.println("Money to be paid is : 300 Rs");
                        if(tm==3)
                        System.out.println("Money to be paid is : 150 Rs");
                        break;
                        case 5:
                        System.out.println("Enter 1 for Subha Rasi ; 2 for Oddigayul");
                        tm=Integer.parseInt(br.readLine());
                        if(tm==1)
                        System.out.println("Money to be paid is : 75 Rs");
                        if(tm==2)
                        System.out.println("Money to be paid is : 350 Rs");
                        break;
                       
                  }
                  System.out.println("~~~~~THANKYOU~~~~~~");
         }
                void program()throws IOException
                {
                  System.out.println("The time slots are:-");
                  for (i=0;i<24;i++)
                  {
                     System.out.println(time[i]);
                  }
                  System.out.println("Enter time slot");
                  int t=Integer.parseInt(br.readLine());
                  if(t<25)
                  {
                  System.out.println("The programs running are:");
                  System.out.println("Ten sports-"+a[t]);
                  System.out.println("NEO-"+b[t]);
                  System.out.println( "Nick-"+c[t]);
                  System.out.println("Disney-"+d[t]);
                  System.out.println("Vh1-"+e[t]);
                  System.out.println("9XM-"+f[t]);
                  System.out.println("TLC-"+g[t]);
                  System.out.println("Star World-"+h[t]);
                  System.out.println("NDTV-"+j[t]);
                  System.out.println("CNN-"+k[t]);
                  System.out.println("Colours-"+l[t]);
                  System.out.println("Max-"+m[t]);
                  System.out.println("Pix-"+y[t]);
                  System.out.println("HBO-"+o[t]);
                  System.out.println("Jaya Tv-"+p[t]);
                  System.out.println("Sun Tv-"+q[t]);
                  System.out.println("Udaya-"+r[t]);
                  System.out.println("ETV Kannada-"+u[t]);
                  System.out.println("Asianet-"+v[t]);
                  System.out.println("Surya-"+w[t]);
                                     
                                     
                  } 
                  else
                  {
                  System.out.println("Wrong entry");
                  }
                  System.out.println("~~~~~THANKYOU~~~~~~");
                }
                
               void play()throws IOException
                {
                int count1=0;
                System.out.println("=>Enter 1 for quiz ");

                System.out.println("=>Enter 2 for Maths puzzles(KIDS)");

                System.out.println("Enter your choice=>");

                int cs=Integer.parseInt(br.readLine());

                int count=0;

                switch(cs)

                {

                  case 1:

                  System.out.println("hey!!! Welcome to the casaba quiz");

                  System.out.println("********* ********* *********** *********** ");

                  System.out.println("Q1=>Which was the world's first artificial satellite?");

                  System.out.println("Your options are :");

                  System.out.println("1.Sputink");

                  System.out.println("2.Explorer");

                  System.out.println("3.luna");

                  System.out.println("Enter 1,2 or 3");

                  ans=Integer.parseInt(br.readLine());

                  if(ans==1)

                  {

                    System.out.println("Right Answer!!! ");

                    count++;

                  }

                  else
                    
                    System.out.println("Sorry!! Wrong answer");

                    System.out.println("*****************************************");

                    System.out.println("Q2=>How did the early mesopotamians write?");

                    System.out.println("Your options are :");

                    System.out.println("1.paper");

                    System.out.println("2.card board");

                    System.out.println("3.Tablet of wet clay");

                    System.out.println("Enter 1,2 or 3");

                    ans=Integer.parseInt(br.readLine());

                    if(ans==3)

                     {

                        System.out.println("Right Answer!!! ");

                        count++;

                      }

                    else

                        System.out.println("Sorry!! Wrong answer");

                    System.out.println("***************************************");

                    System.out.println("Q3=>What is a reed?");

                    System.out.println("Your options are :");

                    System.out.println("1.tall grassy plant");

                    System.out.println("2.leaves");

                    System.out.println("3.a kind of bamboo plant");

                    System.out.println("4.palm leaves");

                    System.out.println("Enter 1,2,3 or 4");

                    ans=Integer.parseInt(br.readLine());

                    if(ans==3)

                    {

                       System.out.println("Right Answer!!! ");

                       count++;

                    }

                    else

                      System.out.println("Sorry!! Wrong answer");

                      System.out.println("****************************************");

                      System.out.println("Q4=>Name the Queen under whom Britain became an empire?");

                      System.out.println("Your options are :");

                      System.out.println("1.Lady Diana");

                      System.out.println("2.Mother Teresa");

                      System.out.println("3.Queen Elizebeth");

                      System.out.println("Enter 1,2 or 3");

                      ans=Integer.parseInt(br.readLine());

                      if(ans==3)

                      {

                         System.out.println("Right Answer!!! ");

                         count++;

                      }

                      else

                       System.out.println("Sorry!! Wrong answer");

                       System.out.println("**********************************************");

                       System.out.println("Q5=>Which country has a maple leaf in the flag?");

                       System.out.println("Your options are :");

                       System.out.println("1.australia ");

                       System.out.println("2.nepal");

                       System.out.println("3.canada");

                       System.out.println("4.switzerland");

                       System.out.println("Enter 1,2,3or 4");

                       ans=Integer.parseInt(br.readLine());

                       if(ans==3)

                       {

                          System.out.println("Right Answer!!! ");

                           count++;

                        }

                       else

                         System.out.println("Sorry!! Wrong answer");

                         System.out.println("***********GAME OVER**************");

                         System.out.println("your total score is "+count+" out of five");
                         
                         System.out.println("~~~~~THANKYOU~~~~~~");

                        break;

                         case 2:

                         System.out.println("heyy!! Welcome to the Maths puzzels");

                         System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

                         System.out.println("If you add 1 to me,I become the smallest four digit number.Who am I?");

                         System.out.println("Your options are :(1) 111 ,(2) 999 (3) 909 ,(4) 1001");

                         System.out.println("Enter 1,2,3 or 4");

                         ans=Integer.parseInt(br.readLine());

                         if(ans==2)

                          {

                             System.out.println("Right Answer!!!");

                             count1++;

                          }

                         else

                          System.out.println("Wrong Answer...");

                          System.out.println("*********************************************");

                          System.out.println("Mr.Rao, has admitted 245 students for 1 room. if he has 7 sections,many students will be in each room they are divided equally");

                          System.out.println("Your options are : (1) 15 , (2) 45 , (3) 25 ,(4) 35");

                          System.out.println("Enter 1,2,3 or 4");

                          ans=Integer.parseInt(br.readLine());

                          if(ans==4)

                          {

                            System.out.println("Right Answer!!!");

                            count1++;

                           }

                          else

                             System.out.println("Wrong Answer...");

                             System.out.println("******************************************");

                             System.out.println("The answer got after solving 4009+2451-3948");

                             System.out.println("Your options are : 1.2512 , 2.2522 , 3.2502 , 4.2532");

                             System.out.println("Enter 1,2,3 or 4");

                             ans=Integer.parseInt(br.readLine());

                             if(ans==1)

                             {

                                 System.out.println("Right Answer!!!");

                                 count1++;

                              }

                            else

                                System.out.println("Wrong Answer...");

                                System.out.println("***************************************");

                                System.out.println("The largest 4 digit number that can be formed using 7,8,9,1");

                                System.out.println("Your options are : 1.9186,2.9871,3.9781,4.9718");

                                System.out.println("Enter 1,2,3 or 4");

                                ans=Integer.parseInt(br.readLine());

                              if(ans==2)

                               {

                                    System.out.println("Right Answer!!!");

                                    count1++;

                                }

                              else

                                  System.out.println("Wrong Answer...");

                                  System.out.println("**********************************************");

                                  System.out.println("########GAME OVER#######");

                                  System.out.println("YOUR SCORE IS " + count1 + " out of four");

                                  break;

                                default:

                                 System.out.println("wrong entry");

                                 break;

                               }

                 }

}