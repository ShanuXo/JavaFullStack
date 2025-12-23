

// class A implements java.lang.Runnable{
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println("Hey");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements java.lang.Runnable{
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println("Shanu");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }


public class RunnableInJava {
    public static void main(String[] args) {
        {
            // Runnable obj1= new Runnable()
            // {
            //     public void run()
            //     {
            //         for(int i=1;i<=5;i++)
            //         {
            //             System.out.println("Hey");
            //             try {
            //                 Thread.sleep(10);
            //             } catch (InterruptedException e) {
            //                 e.printStackTrace();
            //             }
            //         }
            //     }
            // };
            // Runnable obj2=new Runnable()
            // {
            //      public void run()
            //     {
            //         for(int i=1;i<=5;i++)
            //         {
            //             System.out.println("Shanu");
            //             try {
            //                 Thread.sleep(10);
            //             } catch (InterruptedException e) {
            //                 e.printStackTrace();
            //             }
            //         }
            //     }
            // };

            // Thread t1=new Thread(obj1);
            // Thread t2=new Thread(obj2);

            // t1.start();
            // t2.start();

            // Using Lambda Expression
            Thread obj1= new Thread (() -> 
            {
                    for(int i=1;i<=5;i++)
                    {
                        System.out.println("Hey");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            });
            Thread obj2=new Thread (() ->
            {
                    for(int i=1;i<=5;i++)
                    {
                        System.out.println("Shanu");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            });

            obj1.start();
            obj2.start();
        }
    }
}
