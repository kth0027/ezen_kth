package Day03_제어문;

import java.util.Scanner;

public class Day03_5 { // c s

	public static void main(String[] args) { // m s

		Scanner scanner = new Scanner(System.in);
		// 반복으로 별모양 찍기
		
//		// 문제1) 입력받은 별 모양 찍기
//		System.out.println( "문제1) 별 개수 : ");	int s = scanner.nextInt();
//		for ( int i = 1; i<=s; i++) { System.out.println("*"); }
//		
//		System.out.println("----------------");
//		
//		// 문제2) 입력받은 정수만틈 별 출력 // 5개마다 (5배수) 출바꿈
//		System.out.println( " 문제2) 별 개수 : "); int s2 = scanner.nextInt();
//		for ( int i = 1; i<=s2; i++) {
//			System.out.println( "*");
//			if ( i%5==0) System.out.println();
//		}
//		System.out.println("----------------");
		
		
		

		
		
				
/* 

별문제3 : 입력받은 줄 만큼 출력	현재줄수 :	i					별개수 :	s

	*								i = 1						s = 1				
	**								i = 2						s = 1 2 
	***								i = 3						s = 1 2 3 4
	****							i = 4						s = 1 2 3 4
	***** 							i = 5						s = 1 2 3 4 5
									
									i 는 1부터 5까지 1씩 증가		s 는 1부터 i 까지 1씩 증가
									
*/
				
//				// 문제3) 
//				System.out.print( "문제3) 줄수 : "); int line3 = scanner.nextInt();
//					// i는 1부터 입력받은 줄수(line)까지 1씩 증가하면서 내려감
//					for ( int i = 1; i <= line3; i++) {
//						//별찍기
//						for ( int s = 1; s<=i; s++) { System.out.print("*");}
//							//줄바꿈
//							System.out.println();
//						
//					}
//				System.out.println("----------------");
								

/*
별문제4 : 입력받은 줄 만큼 출력	현재줄수 :	i					별개수 :	s

	*****							i = 5						s = 1 2 3 4 5		
	****							i = 4						s = 1 2 3 4
	***								i = 3						s = 1 2 3
	**								i = 2						s = 1 2
	*								i = 1						s = 1
									
									i 는 1부터 5까지 1씩 증가		s 는 전체줄수 - 현재줄수 +1
									
*/
									
//									// 문제4) 	
//									System.out.print("문제4) 줄 수 : "); int line4 = scanner.nextInt();
//									
//									for( int i = 1 ; i<=line4 ; i++ ) {
//										// 별찍기 
//										for( int s = 1 ; s<=line4-i+1 ; s++ ) { System.out.print("*");}
//										// 줄바꿈
//										System.out.println();
//									}
//									
//								System.out.println("\n ----------------------------");	


/*
별문제5 : 입력받은 줄 만큼 출력	현재줄수 :	i					별개수 :	s					공백 : 	b

        *							i = 1						s = 1						b = 1 2 3 4
       **							i = 2						s = 1 2 					b = 1 2 3 
      ***							i = 3						s = 1 2 3					b = 1 2 
     ****							i = 4						s = 1 2 3 4					b = 1
	*****							i = 5						s = 1 2 3 4 5				b = 

									i 는 1부터 5까지 1씩 증가		s는 1부터 i까지 1씩 증가  	  	b는 전체줄수 - 현재줄수
*/

		
//		// 문제5)
//		System.out.print("문제5) 줄 수 : "); int line5 = scanner.nextInt();
//		for( int i = 1 ; i<=line5 ; i++ ) {
//			// 공백찍기 
//			for( int b = 1 ; b<=line5-i ; b++ ) { System.out.print(" "); }			
//			// 별찍기 
//			for( int s = 1 ; s<=i ; s++ ) { System.out.print("*");}
//			// 줄바꿈
//			System.out.println();
//		}


//별문제6 : 입력받은 줄 만큼 출력		현재줄수 :	i					별개수 :	s					공백 : 	b
//
//	*****								i = 1						s = 5						b = 
//	 ****								i = 2						s = 4						b = 1
//	  ***								i = 3						s = 3						b = 1 2
//	   **								i = 4						s = 2						b = 1 2 3
//	    *								i = 5						s = 1						b = 1 2 3 4
//
//	    								i 는 1부터 5까지 1씩 증가		s는 전체줄수 - 현재줄수 +1	  	b는 1부터 i-1까지 1씩 증
		
		// 문제6)	
//				System.out.print("문제6) 줄 수 : "); int line6 = scanner.nextInt();
//				for( int i =1 ; i<=line6 ; i++ ) {
//					//공백찍기
//					for( int b = 1 ; b<=i-1 ; b++ ) { System.out.print(" ");}
//					//별찍기
//					for( int s = 1 ; s<=line6-i +1 ; s++ ) {System.out.print("*");}
//					//줄바꿈
//					System.out.println();
//				}
				

		
/*		
별문제7 : 입력받은 줄 만큼 출력		현재줄수 :	i					별개수 :	s						공백 : 	b

        *								i = 1						s = 1							b = 1 2 3 4
       ***								i = 2						s = 1 2 3						b = 1 2 3
      *****								i = 3						s = 1 2 3 4 5					b = 1 2
     *******							i = 4						s = 1 2 3 4 5 6 7				b = 1
	*********							i = 5						s = 1 2 3 4 5 6 7 8 9 			b = 
										
										i 는 1부터 5까지 1씩 증가		s는 (현재줄수 * 2) - 1	  			b는 전체줄수 - 현재줄수 
	
*/
		

		// 문제7)	
//				System.out.print("문제7) 줄 수 : "); int line7 = scanner.nextInt();
//				for( int i = 1 ; i<=line7 ; i++ ) {
//					//공백찍기
//					for( int b = 1 ; b<=line7-i ; b++ ) { System.out.print(" ");}
//					//별찍기 
//					for( int s = 1 ; s<=i*2-1 ; s++ ) {System.out.print("*");}
//					//줄바꿈
//					System.out.println();
//				}
			

/*
별문제8 : 입력받은 줄만큼 출력 		현재줄수 :	i					s개수 :	s						공백 : 	b
	    
	    1								i = 1						s = 1							b = 1 2 3 4
       222								i = 2						s = 1 2 3						b = 1 2 3
      33333								i = 3						s = 1 2 3 4 5					b = 1 2
     4444444							i = 4						s = 1 2 3 4 5 6 7				b = 1
	555555555							i = 5						s = 1 2 3 4 5 6 7 8 9 			b = 

										i 는 1부터 5까지 1씩 증가		s는 (현재줄수 * 2) - 1	  			b는 전체줄수 - 현재줄수 
*/
				
//				// 문제8)	
//				System.out.print("문제8) 줄 수 : "); int line8 = scanner.nextInt();
//				for( int i = 1 ; i<=line8 ; i++ ) {
//					//공백찍기
//					for( int b = 1 ; b<=line8-i ; b++ ) { System.out.print(" ");}
//					//별찍기 
//					for( int s = 1 ; s<=i*2-1 ; s++ ) {System.out.print(i);}
//					//줄바꿈
//					System.out.println();
//				}


/*
별문제9 : 입력받은 줄만큼 출력			현재줄수 :	i					s개수 :	s						공백 : 	b

	*********							i = 1						s = 1 2 3 4 5 6 7 8 9			b =  
	 *******							i = 2						s = 1 2 3 4 5 6 7				b = 1
	  *****								i = 3						s = 1 2 3 4 5					b = 1 2
	   ***								i = 4						s = 1 2 3						b = 1 2 3
	    *								i = 5						s = 1							b = 1 2 3 4 

	    								i 는 1부터 5까지 1씩 증가		s는 전체줄수*2 - (현재줄수*2 -1)		b는 1부터 i-1까지 1씩 증 
*/
				
				// 문제9)	
				System.out.print("문제9) 줄 수 : "); int line9 = scanner.nextInt();
				for( int i = 1 ; i<=line9 ; i++ ) {
					for( int b = 1 ; b<=i-1 ; b++ ) {System.out.print(" ");}
					for( int s = 1 ; s<=line9*2-(i*2-1); s++ ) {System.out.print("*");}
					System.out.println();
				}
	    					

/*
별문제10 : 입력받은 줄만큼 출력		현재줄수 :	i					s개수 :	s						공백 : 	b

        *								i = 1						s = 1							b = 1 2 3 4 
       ***								i = 2						s = 1 2 3						b = 1 2 3 
      *****								i = 3						s = 1 2 3 4 5					b = 1 2  
	 *******							i = 4						s = 1 2 3 4 5 6 7				b =	1 
	*********							i = 5						s = 1 2 3 4 5 6 7 8 9			b =  
	 *******							i = 6						s = 1 2 3 4 5 6 7				b = 1 
	  *****								i = 7						s = 1 2 3 4 5 					b = 1 2 
	   ***								i = 8						s = 1 2 3 						b = 1 2 3 
	    *								i = 9						s = 1							b = 1 2 3 4 
	    								
	    								i 는 1부터 9까지 1씩 증가		s는 								b는 
*/


/*
별문제11 : 입력받은 줄만큼 출력 [ 입력받은 행/열 동일 ]		현재줄수 :	i					s개수 :	s						공백 : 	b	 
				
	*     *												i = 1						s = 2							b = 1 2 3
	 *   *												i = 2						s = 2							b = 1 2
	  * *												i = 3						s = 2							b = 1
	   *												i = 4						s = 1							b = 
      * *												i = 5						s = 2							b = 1
     *   *												i = 6						s = 2							b = 1 2	
    *     *												i = 7						s = 2							b = 1 2 3

														i 는 1부터 7까지 1씩 증가		s는 								b는 
현재행+현재열 == 전체행+1 
									
*/


		
/*
별문제12 : 입력받은 줄만큼 출력

	*        *
	**      **
	***    ***
	****  ****
	**********
	****  ****
	***    ***
	**      **
	*        *
*/        

/*
//별문제13 : 입력받은 줄만큼 출력

  	                   *                        
                      * *                       
                     *****                      
                    *     *                     
                   * *   * *                    
                  ***** *****                   
                 *           *                  
                * *         * *                 
               *****       *****                
              *     *     *     *               
             * *   * *   * *   * *              
            ***** ***** ***** *****             
           *                       *            
          * *                     * *           
         *****                   *****          
        *     *                 *     *         
       * *   * *               * *   * *        
      ***** *****             ***** *****       
     *           *           *           *      
    * *         * *         * *         * *     
   *****       *****       *****       *****    
  *     *     *     *     *     *     *     *   
 * *   * *   * *   * *   * *   * *   * *   * *  
***** ***** ***** ***** ***** ***** ***** *****	

*/

	
	
	} // m e
} // c e
