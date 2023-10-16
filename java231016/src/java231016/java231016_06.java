package java231016;

public class java231016_06 {
	public static void main(String[] args) {
		int ary[] = {10, 20, 30, 40, 50};
		int count, size;
		
		count = ary.length;
		size = count * Integer.BYTES;
		
		System.out.println("배열 ary[]의 요소 개수 : " + count);
		System.out.println("배열 ary[]의 요소 전체 크기 : "+ size);
	}
}
