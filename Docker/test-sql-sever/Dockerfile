FROM mcr.microsoft.com/mssql/server:2017-latest

    ENV ACCEPT_EULA=Y
    ENV SA_PASSWORD=phAciu#2712
    ENV MSSQL_PID=Developer
    ENV MSSQL_TCP_PORT=1433

    WORKDIR /src

    COPY filldata.sql ./filldata.sql

    RUN (/opt/mssql/bin/sqlservr --accept-eula & ) | grep -q "Service Broker manager has started" &&  /opt/mssql-tools/bin/sqlcmd -S127.0.0.1 -Usa -PphAciu#2712 -i filldata.sql