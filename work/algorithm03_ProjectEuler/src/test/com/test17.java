package test.com;

public class test17 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // 1부터 5까지의 숫자를 영어로 쓰면 one, two, three, four, five 이고,
        // 각 단어의 길이를 더하면 3 + 3 + 5 + 4 + 4 = 19 이므로
        // 사용된 글자는 모두 19개입니다.
        //
        // 1부터 1,000까지 영어로 썼을 때는 모두 몇 개의 글자를
        // 사용해야 할까요?
        //
        // 참고: 빈 칸이나 하이픈('-')은 셈에서 제외하며,
        // 단어 사이의 and 는 셈에 넣습니다.
        // 예를 들어
        // 342를 영어로 쓰면 three hundred and forty-two 가 되어서 23 글자,
        // 115 = one hundred and fifteen 의 경우에는 20 글자가 됩니다.


        System.out.println(getSpellNumber(1));
        System.out.println(getSpellNumber(11));
        System.out.println(getSpellNumber(44));
        System.out.println(getSpellNumber(111));

        System.out.println(getSpellNumber(342));
        // - 와 공백 제거 해서 길이계산 - three hundred and forty-two : 23
        System.out.println(getSpellNumber(342).replace("-", "").replace(" ", "").length());

        System.out.println(getSpellNumber(115));

        // - 와 공백 제거 해서 길이계산 - one hundred and fifteen : 20
        System.out.println(getSpellNumber(115).replace("-", "").replace(" ", "").length());

        // - 와 공백 제거 해서 길이계산 - onetwothreefour~~~~hundred and ninety-nineone thousand :
        // 21124
        System.out.println("sum total : " + getSumSpellNumber(1000).replace("-", "").replace(" ", "").length());

        System.out.println("Time:" + (System.currentTimeMillis() - startTime));
    }

    private static String getSumSpellNumber(int su) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= su; i++) {
            sb.append(getSpellNumber(i));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    private final static String[] zero_nineteen = { "zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen" };
    private final static String[] twenty_ninety = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
            "eighty", "ninety" };

    public static String getSpellNumber(int i) {
        if (i < 20)
            return zero_nineteen[i];
        if (i < 100)
            return twenty_ninety[i / 10] + ((i % 10 > 0) ? "-" + getSpellNumber(i % 10) : "");
        if (i < 1000)
            return zero_nineteen[i / 100] + " hundred" + ((i % 100 > 0) ? " and " + getSpellNumber(i % 100) : "");
        if (i < 1000000)
            return getSpellNumber(i / 1000) + " thousand" + ((i % 1000 > 0) ? " " + getSpellNumber(i % 1000) : "");
        return getSpellNumber(i / 1000000) + " million" + ((i % 1000000 > 0) ? " " + getSpellNumber(i % 1000000) : "");
    }

}
