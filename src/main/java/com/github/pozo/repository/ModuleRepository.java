package com.github.pozo.repository;
import java.util.ArrayList;

import com.github.pozo.domain.Instrument;
import com.github.pozo.domain.Module;
import com.github.pozo.domain.Position;


public class ModuleRepository {
	public static ArrayList<Module> getModules() {
		Instrument instrumenta = new Instrument("A");
		Instrument instrumentb = new Instrument("B");
		Instrument instrumentc = new Instrument("C");
		Instrument instrumentd = new Instrument("D");
		
		Module modulea = new Module("A");
		
		Position positionaA = new Position(instrumenta);
		Position positionaB = new Position(instrumentb);
		Position positionaC = new Position(instrumentc);
		Position positionaD = new Position(instrumentd);
		
		
		modulea.addPosition(positionaA.setInitialWeight(21));
		modulea.addPosition(positionaB.setInitialWeight(10));
		modulea.addPosition(positionaC.setInitialWeight(22));
		modulea.addPosition(positionaD.setInitialWeight(33));
		
		Module moduleb = new Module("B");
		
		Position positionbA = new Position(instrumenta);
		Position positionbB = new Position(instrumentb);
		Position positionbC = new Position(instrumentc);
		Position positionbD = new Position(instrumentd);
		
		moduleb.addPosition(positionbA.setInitialWeight(10));
		moduleb.addPosition(positionbB.setInitialWeight(55));
		moduleb.addPosition(positionbC.setInitialWeight(55));
		moduleb.addPosition(positionbD.setInitialWeight(11));
		
		Module modulec = new Module("C");
		
		Position positioncA = new Position(instrumenta);
		Position positioncB = new Position(instrumentb);
		Position positioncC = new Position(instrumentc);
		Position positioncD = new Position(instrumentd);
		
		modulec.addPosition(positioncA.setInitialWeight(33));
		modulec.addPosition(positioncB.setInitialWeight(9));
		modulec.addPosition(positioncC.setInitialWeight(11));
		modulec.addPosition(positioncD.setInitialWeight(16));
		
		Module moduled = new Module("D");
		
		Position positiondA = new Position(instrumenta);
		Position positiondB = new Position(instrumentb);
		Position positiondC = new Position(instrumentc);
		Position positiondD = new Position(instrumentd);
		
		moduled.addPosition(positiondA.setInitialWeight(33));
		moduled.addPosition(positiondB.setInitialWeight(9));
		moduled.addPosition(positiondC.setInitialWeight(11));
		moduled.addPosition(positiondD.setInitialWeight(16));
		
		ArrayList<Module> modules = new ArrayList<Module>();
		modules.add(modulea);
		modules.add(moduleb);
		modules.add(modulec);
		modules.add(moduled);
		return modules;
	}
}
