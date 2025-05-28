class HelloWorldParametro {
    public static void main(String[] args){
        System.out.println(args.length);
        System.out.println(String.join("," , args));

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println(x + y);

    }
    
}
