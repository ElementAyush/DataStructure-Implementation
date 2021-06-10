import java.io.IOException;
import java.nio.file.Files ;
import java.nio.file.Path ;
import java.nio.file.Paths ;
import java.util.stream.Stream;
import java.io.BufferedReader;


class ReadFilesExample
{
	public static void main(String[] args){
		Path path = Paths.get("addresses.csv");
		try(Stream<String> data = Files.lines(path)){ 
             data
                 .forEach(System.out :: println) ;
		}catch(Exception e){
			System.out.println(e) ;

		}

		try(BufferedReader bf = Files.newBufferedReader(Paths.get("addresses.csv"))){
			bf.lines()
			.forEach(System.out :: println);
		}catch(IOException e){
			
		}
	} 
}