/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package inf3143.logique.exemples.universite;

public class Etudiant {
	public String nom;
	public Double moyenne;
	public Boolean estInscrit = false;

	public Etudiant(String nom, Double moyenne) {
		this.nom = nom;
		this.moyenne = moyenne;
	}

	public void renomer(String nouveauNom) {
		this.nom = nouveauNom;
	}

	public String getNom() {
		return this.nom;
	}

	public void inscrire() {
		this.estInscrit = true;
	}
}