# eCommerceBackend

## Overview
The `eCommerceBackend` is a comprehensive backend solution for an eCommerce platform. This project consists of multiple services that are responsible for different functions in the ecosystem, from product catalog management to user authentication, payment processing, and more.

## Key Services

1. **Product Catalog Service**
   - Manages product data, including listing, sorting, and searching.
   - Integrates with other services like `Payment Service` for transactions.
   
2. **User Authentication Service**
   - Handles user signups, logins, and authentication via JWT and OAuth2.
   - Secures APIs and protects sensitive user data.
   
3. **Email Service**
   - Sends transactional and promotional emails to users.
   - Integrates with the user authentication.

4. **Payment Integration**
   - Razorpay and Stripe are integrated for handling secure payments and payment gateway reconciliation.

5. **Search, Paging, and Sorting APIs**
   - Provides APIs for searching, paginating, and sorting product data in the catalog.
   
6. **Kafka Integration**
   - Used for real-time event streaming and messaging between services.
   
7. **Redis Integration**
   - Implements caching strategies to optimize performance and reduce database load.

8. **Cloud Deployment**
   - Hosted on AWS with EC2, Elastic Beanstalk, VPC, and RDS for scalability and high availability.

9. **Eureka Server**
    - Utilized for service discovery, allowing `ProductCatalogService` and `UserAuthenticationService` to communicate and scale independently.

## Technologies Used

- **Spring Boot** for backend services.
- **JPA/Hibernate** for database management.
- **JWT/OAuth2** for authentication and security.
- **Kafka** for messaging and event-driven architecture.
- **Redis** for caching.
- **AWS** (EC2, RDS, Elastic Beanstalk) for deployment.
- **Stripe & Razorpay** for payment integration.
  
## Project Structure
```
eCommerceBackend/
├── ProductCatalogService/
├── UserAuthenticationService/
├── EmailService/
├── PaymentService/
├── KafkaIntegration/
├── RedisIntegration/
├── CloudDeployment/
└── EurekaServer/
```

## How to Set Up Locally

1. Clone this repository:
   ```bash
   git clone https://github.com/tanay-vj/eCommerceBackend.git
   ```

2. Navigate to the directory of the desired service:
   ```bash
   cd ProductCatalogService
   ```

3. Install dependencies (if any):
   ```bash
   mvn install
   ```

4. Run the service:
   ```bash
   mvn spring-boot:run
   ```

Repeat the steps for other services by navigating into their respective directories.

## Contributing

Feel free to fork this repository and submit pull requests for any improvements, bug fixes, or new features.
