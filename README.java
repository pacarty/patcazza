if (discount == price) {
						//new price calculated depending on agent
						replyForDiscount.setPerformative(ACLMessage.AGREE); // Set performative to AGREE when discount
					} else {
						replyForDiscount.setPerformative(ACLMessage.REFUSE); // Set performative to REFUSE when not discount
					}
