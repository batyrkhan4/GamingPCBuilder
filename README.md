# Gaming PC Builder

This project demonstrates the Builder Pattern in Java.

## Product

The product is a Gaming PC. It consists of:

- CPU
- GPU
- RAM
- Storage
- Power Supply

The Builder Pattern allows us to create different Gaming PC configurations step by step.

## Builders

The project has two Concrete Builders:

- `StandardGamingPCBuilder` — creates a more powerful gaming PC.
- `BudgetGamingPCBuilder` — creates a budget gaming PC with default components.

## How to Build

To create a Standard Gaming PC, use:

```java
GamingPC standardPC =
        new GamingPCDirector().constructStandardPC(
                new StandardGamingPCBuilder()
        );
```
To create a Budget Gaming PC, use:

```java
GamingPCBuilder budgetBuilder =
        new BudgetGamingPCBuilder();

GamingPC budgetPC = budgetBuilder.build();
```

## How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is configured.
3. Run the Main.java file.
4. The program will print both the Standard PC and the Budget PC configurations.

## Example Output
```
STANDARD PC:
Gaming PC:
CPU: AMD Ryzen 7 7800X3D
GPU: NVIDIA RTX 5070
RAM: 32GB
Storage: 2TB SSD
Power Supply: 850W

BUDGET PC:
Gaming PC:
CPU: AMD Ryzen 5 5600
GPU: NVIDIA RTX 4060
RAM: 16GB
Storage: 1TB SSD
Power Supply: 650W
```
