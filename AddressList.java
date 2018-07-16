package project4;

public class AddressList {
	/**
	 * This nested, private class represents a node of a singly linked list.
	 */
	private ListNode head;
	private ListNode current;

	private class ListNode {
		private String name;
		
		// Telephone number
		private String tel;
		
		
		private String email;
		
		// Address
		private String addr;
		
		// Date of birth
		private String dob;
		
		// Pointer to the next node
		private ListNode next;

		
		
		private ListNode(String name, String tel, String email, String addr,
				String dob) {
			this.name = name;
			this.tel = tel;
			this.email = email;
			this.addr = addr;
			this.dob = dob;
			next = null; 
		} // end of the constructor

		public String getName() {
			return name;
		}

		public String getTel() {
			return tel;
		}

		public String getEmail() {
			return email;
		}

		public String getAddr() {
			return addr;
		}

		public String getDob() {
			return dob;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode link) {
			next = link;
		}
	} // end of class ListNode
	
	/**
	 * solutions to each method using recursive approach and helpers
	 * addToFront
	 * addToBack
	 * ToString
	 * ReverseToString
	 * Reverse
	 * SizeOf
	 * IsEmpty
	 * PhoneNumberByName
	 * EmailByName
	 * DobByName
	 * NameByPhoneNumber
	 * 
	 */

	public boolean isEmpty() {
		return (sizeOf() <= 0);
	}

	public int sizeOf() {
		return sizeOf(head);
	}

	public void addToFront(String name, String tel, String email,
			String address, String dob) {
		ListNode newNode = new ListNode(name, tel, email, address, dob);
		current = newNode;
		current.setNext(head);
		head = current;
	}

	public void addToBack(String name, String tel, String email,
			String address, String dob) {
		ListNode newNode = new ListNode(name, tel, email, address, dob);
		if (head == null) {
			current = newNode;
			head = current;
		} else {
			current = getBackNode(head);
			current.setNext(newNode);
		}

	}

	private ListNode getBackNode(ListNode node) {
		if (node.getNext() == null) {
			return node;
		} else {
			return getBackNode(node.getNext());
		}
	}

	public String toString() {
		return toString(head);

	}

	public String reverseToString() {
		return toStringReverse(head);
	}

	public String toString(ListNode node) {
		current = node;
		String finalString;
		finalString = "Name: " + current.getName() + "\n" + "Telephone: "
				+ current.getTel() + "\n" + "Email: " + current.getEmail()
				+ "\n" + "Address: " + current.getAddr() + "\n" + "DOB: "
				+ current.getDob() + "\n\n";
		if (current.getNext() == null) {
			current = head;
			return finalString;
		} else {
			current = current.getNext();
			return finalString + toString(current);
		}
	}

	public String toStringReverse(ListNode node) {
		current = node;
		String result;
		result = "Name: " + current.getName() + "\n" + "Telephone: "
				+ current.getTel() + "\n" + "Email: " + current.getEmail()
				+ "\n" + "Address: " + current.getAddr() + "\n" + "DOB: "
				+ current.getDob() + "\n\n";
		if (current.getNext() == null) {
			current = head;
			return result;
		} else {
			current = current.getNext();
			return toStringReverse(current) + result;
		}
	}

	private void reverse(ListNode node, AddressList list) {
		if (node.getNext() == null)
			list.addToFront(node.getName(), node.getTel(), node.getEmail(),
					node.getAddr(), node.getDob());
		else {
			list.addToFront(node.getName(), node.getTel(), node.getEmail(),
					node.getAddr(), node.getDob());
			reverse(node.getNext(), list);
		}
	}

	public AddressList reverse() {
		AddressList list = new AddressList();
		if (head != null) {
			reverse(head, list);
			return list;
		}
		return null;
	}

	public int sizeOf(ListNode node) {
		current = node;
		if (current == null)
			return 0;
		else {
			return 1 + sizeOf(current.getNext());
		}
	}

	

	public String phoneNumberByName(ListNode node, String name) {
		current = node;
		try {
			if (current.getName().equals(name)) {
				return current.getTel();
			} else {
				current = current.getNext();
				return phoneNumberByName(current, name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
	}

	public String emailByName(ListNode node, String name) {
		current = node;
		try {
			if (current.getName().equals(name)) {
				return current.getEmail();
			} else {
				current = current.getNext();
				return emailByName(current, name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
	}

	public String nameByPhoneNumber(ListNode node, String tel) {
		current = node;
		try {
			if (current.getTel().equals(tel)) {
				return current.getName();
			} else {
				current = current.getNext();
				return nameByPhoneNumber(current, tel);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
	}

	public String dobByName(ListNode node, String name) {
		current = node;
		try {
			if (current.getName().equals(name)) {
				return current.getDob();
			} else {
				current = current.getNext();
				return dobByName(current, name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "error";
		}
	}
	
	public String phoneNumberByName(String name) {
		return phoneNumberByName(head, name);
	}

	public String emailByName(String name) {
		return emailByName(head, name);
	}

	public String nameByPhoneNumber(String tel) {
		return nameByPhoneNumber(head, tel);
	}

	public String dobByName(String name) {
		return dobByName(head, name);
	}

} // end of class AddressList