## Notes:
This is a sample of dockerized spring boot project along with the Postgres database.
The only thing you need to do is:        
    
        docker-compose up

You can also stop the application container and just run the application on your system. For example for debug purposes. 

Datasource url automaticaly changes depending on whether the app is in a container or not.

However directories that created by docker-compose are by default read-only. If you want to affect them use your superuser privilege