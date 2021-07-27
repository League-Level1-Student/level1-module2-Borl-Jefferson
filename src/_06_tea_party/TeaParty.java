package _06_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String ad = "Hello ";
		if (isWoman) {
			if (isKnighted) {
				ad += "Lady ";
			} else {
				ad += "Ms. ";
			}
		} else {
			if (isKnighted) {
				ad += "Sir ";
			} else {
				ad += "Mr. ";
			}
			}
		ad += name;
		return ad;
	}
}
