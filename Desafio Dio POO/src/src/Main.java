
package src;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;



	public class Main {
		public static void main (String[]args) {
			// a classe é comno se fosse a planta de uma casa e o objeto é como se fosse a casa construída//
			Curso curso1 = new Curso();// É a partir da plavra new que instaciamos o objeto//
			
			curso1.setTitulo("Curso Java");
			curso1.setDescricao("Descrição curso java");
			curso1.setCargaHoraria(8);
			
			
			Curso curso2 = new Curso();
			
			curso2.setTitulo("Curso JS");
			curso2.setDescricao("Descrição curso JS");
			curso2.setCargaHoraria(4);
			
			Mentoria mentoria = new Mentoria();
			mentoria.setTitulo("mentoria java");
			mentoria.setDescricao("Descrição curso java");
			mentoria.setData(LocalDate.now());
			
			//*System.out.println("curso1");//
			//System.out.println("curso2");//
			//System.out.println("mentoria");*//
			
			Bootcamp bootcamp = new Bootcamp();
			bootcamp.setNome("Bootcamp Java Developer");
			bootcamp.setDecricao("Descrição Bootcamp Java Developer");
			bootcamp.getConteudos().add(curso1);
			bootcamp.getConteudos().add(curso2);
			bootcamp.getConteudos().add(mentoria);
			
			Dev devLudymila= new Dev();
			devLudymila.setNome("Ludymila");
			devLudymila.inscreverBootcamp(bootcamp);
			devLudymila.progredir();
			devLudymila.progredir();
			System.out.println("-");
			System.out.println("Conteudos inscritos" + devLudymila.getConteudosInscritos);
			System.out.println("Conteudos concluidos" + devLudymila.getConteudosConcluidos);
			System.out.println("XP" +devLudymila.calcularTotalXp());
			
			System.out.println("-------");
			
			Dev devRodrigo= new Dev();
			devRodrigo.setNome("Rodrigo");
			devRodrigo.inscreverBootcamp(bootcamp);
			devRodrigo.progredir();
			devRodrigo.progredir();
			devRodrigo.progredir();
			System.out.println("-");
			System.out.println("Conteudos inscritos" + devRodrigo.getConteudosInscritos);
			System.out.println("Conteudos concluidos" + devRodrigo.getConteudosConcluidos);
			System.out.println("XP" +devRodrigo.calcularTotalXp());
			
			
			
			
	}
	}

