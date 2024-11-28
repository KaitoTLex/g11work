class lucky7 {
    public static void main(String[] args){
        for(int i = 15; i>0; i--){
            System.out.println("Iteration"+i);
            randomInt(7,71,'d');
            randomInt(70,7,'d');
            randomInt(11,7,'m');
            randomInt(14,-7,'d');
            randomInt(7,700,'m');
            randomInt(52,0,'c');
            randomInt(0,0,'f');
            randomInt(0,0,'r');
        }
	}
    public static void randomInt(int v, int x, char z){
        int j;
        char n;
        double l;
        String[] roulette = {"Black", "Red"};
        String table;
        String alphabet = "abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUVWXYZ";
        switch(z){
            case 'm':
               j = (7*(int)(Math.random()*v)+x);
              System.out.println(j); 
              break;
            case 'd':
               j = ((int)(Math.random()*v)+x);
              System.out.println(j);
              break;
            case 'c':
               n = (alphabet.charAt((int)(Math.random()*v)+x));
               System.out.println(n);
               break;
            case 'f':
                l = ((int)(Math.random()*((10.00)/1.25))* 0.25+7.00);
                System.out.printf("%2.2f\n",l);
                break;
            case 'r':
                j = ((int)(Math.random()*38)+1);
                System.out.print(j);
                j = ((int)(Math.random()*2));
                table = j==1 ? roulette[0] : roulette[1];
                System.out.println(" " + table);
                break;
        }
    }
}
