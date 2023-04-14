# PaymentClient
Payments is an integral component of any e-commerce or fintech.With the advent of digital india, we have seen different types of payments ecosystem rising up - Payments gateways, UPI, Rupay Network etc. These are easy to integrate and any org can get started with this in a matter of days.
 
With the onset of different payment players, organizations integrate different payment gateways and shuffle between them to suit their use cases best.
 
Based on use cases, customers can opt for payment via card / upi / net banking etc. Below is the general runbook for making a payment.
 
- Select a pay mode
- Enter details
    - For netbanking - enter username and password
    - For credit / debit card - enter card details ( number, expiry, cvv etc )
    - UPI - enter vpa
 
Implement a payments gateway which help facilitate a payment for its client, below points should be kept in mind while implementation
 
**Real world example**
 
Flipkart has integrated multiple PGs like Razorpay, Citrus, PaySafe, CCAvenue etc. They use these PGs based on different use cases. For example, divert all credit card transaction to RazorPay while Netbanking goes to CCAvenue.
 
These PGs internally have direct integration with different banks which facilitate the payments.
