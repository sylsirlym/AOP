# AOP
This is a simple Spring Boot Application POC using Aspect Oriented Programming to seperate cross cutting concerns from business logic. 
This POC uses tracing to represent cross cutting concerns.

## Short Notes
### Aspect has :
- **A Pointcut** - defines where the aspect is applied
- **Advice** - code executed
### Advises:
1. **Before Advice** - Executed before method
2. **After Advice** - Executed after methods
3. **Around Advice** - wraps the method
4. **After Throwing** - Executed after throwing an exception
5. **After Returning** - Executed if method successfully returns
