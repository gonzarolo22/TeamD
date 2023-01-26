package com.TeamD.demo;

import com.TeamD.demo.Repository.RegionRepository;
import com.TeamD.demo.Repository.UsuriousRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeamDApplication implements CommandLineRunner {
	private UsuriousRepository usuriousRepository;
	private RegionRepository regionRepository;

	public TeamDApplication(UsuriousRepository usuriousRepository, RegionRepository regionRepository) {
		this.usuriousRepository = usuriousRepository;
		this.regionRepository=regionRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TeamDApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	llenarUsuarios();

	}

	public void llenarUsuarios(){






	}

}
