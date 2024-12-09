package dataStructure.stack;

import java.util.Stack;

public class DataStructureStack {
	public static void main ( String[] args ) {

		/*
		  @Stack stack; LIFO (Last In First Out); Store objects into a sort of “Vertical tower”.
		 * @push() — add a new object to the stack
		 * @pop() — remove the last object from the stack.
		 * @peek() — return the last object from the stack but doesn’t remove it.
		 * **/

		//  Uses of Stacks?
	    //   1. undo/redo features in a text editors.
		//   2. moving b through browser history.
		//   3. backtracking in algorithms. (maze, file directory)
		//   4. calling functions (call stack)



		/*
		*@Message : Create an empty stack
		* @Generic < String > define the type of the stack.
		* */
		Stack < String > stack = new Stack < String > ( );

		/*
		* push() — add a new object to the stack
		* */
		stack.push ( "One piece" );
		stack.push ( "Re:Zero" );
		stack.push ( "Demon Slayer" );
		stack.push ( "Naruto" );
		stack.push ( "Jujustu Kaisen" );
		stack.push ( "Fullmetal Alchemist" );

		/*
		  @print() — print all the objects in the stack
		 * */
		System.out.println ( stack );

		/*
		  @print() — print  whatever is on top of the stack
		 * @peek() — return the last object from the stack but doesn’t remove it.
		 * */
		System.out.println (stack.peek());

		/*
		  @print() — print  whatever is on top of the stack
		 * @pop() — remove the last object from the stack.
		 * */
		System.out.println ( stack.pop ( ) );

 	    /*
	      @print() — print all the objects in the stack after removing the last one.
	     * **/
		System.out.println ( stack );

		/*
		* @variable myFavAnime — remove the last object from the stack.
		* */
		String myFavAnime = stack.pop();

		/*
		  @print() — print  whatever is on top of the stack
		 * @variable myFavAnime — remove the last object from the stack.
		 * */
		System.out.println ( myFavAnime);

		/*
		  @print() — print all the objects in the stack after removing the last one.
		 * **/
		System.out.println ( stack );


		/*
		  @print() — print  whatever is on top of the stack
		 * @variable myFavAnime — remove the last object from the stack.
		 * */
		System.out.println ( myFavAnime);

		/*
		  @print() — print all the objects in the stack after removing the last one.
		 * **/
		System.out.println ( stack );


		/*
		  @print() — print  whatever is on top of the stack
		 * @variable myFavAnime — remove the last object from the stack.
		 * */
		System.out.println ( myFavAnime);

		/*
		  @print() — print all the objects in the stack after removing the last one.
		 * **/
		System.out.println ( stack );


		/*
		  @print() — print  whatever is on top of the stack
		 * @variable myFavAnime — remove the last object from the stack.
		 * */
		System.out.println ( myFavAnime);

		/*
		  @print() — print all the objects in the stack after removing the last one.
		 * **/
		System.out.println ( stack );


			/*
		  @print() — print  whatever is on top of the stack
		 * @variable myFavAnime — remove the last object from the stack.
		 * */
		System.out.println ( myFavAnime);

		/*
		  @print() — print all the objects in the stack after removing the last one.
		 * **/
		System.out.println ( stack );


		
		/*
		  @Message : The stack is empty after removing the last object and now will show a EmptyStackException.
		 */


		/*
		  @print() — print  whatever is on top of the stack
		 * @variable myFavAnime — remove the last object from the stack.
		 *@return @exception java.util.EmptyStackException if the stack is empty.
		 * */
		System.out.println ( myFavAnime );


	}


}
