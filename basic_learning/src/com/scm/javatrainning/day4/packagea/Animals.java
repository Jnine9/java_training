package com.scm.javatrainning.day4.packagea;

/**
 * <h2> Animals Class</h2>
 * <p>
 * Process for Displaying Animals
 * </p>
 * 
 * @author Acer
 *
 */
public class Animals {

	private String type,sound;
	
	/**
	 * <h2> getType</h2>
	 * <p>
	 * Get type of animal
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getType() {
		return type;
	}

	/**
	 * <h2> setType</h2>
	 * <p>
	 * Set animal type
	 * </p>
	 *
	 * @param type
	 * @return void
	 */
	private void setType(String type) {
		this.type = type;
	}
	
	/**
	 * <h2> getSound</h2>
	 * <p>
	 * Get animal sound.
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	protected String getSound() {
		return sound;
	}

	/**
	 * <h2> setSound</h2>
	 * <p>
	 * Set animal sound.
	 * </p>
	 *
	 * @param sound
	 * @return void
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * <h2> Data</h2>
	 * <p>
	 * Get animal's data.
	 * </p>
	 *
	 * @param animal
	 * @return
	 * @return String
	 */
	public String Data(String animal) {
		this.setType(animal);
		String animaltype = this.getType();
		String animalSound = this.getSound();
		String res = animaltype + "'s sound is " + animalSound + ".";
		return res;
	}
	
}
