class practice1 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = "Hello Java";
        StringBuffer sb = new StringBuffer();

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(d.indexOf("Java"));
        System.out.println(d.replaceAll("Java", "World"));
        System.out.println(d.substring(0,4));
        System.out.println(d.toUpperCase());

        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
        System.out.println(sb.substring(0,4));

    }
}