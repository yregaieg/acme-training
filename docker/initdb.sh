#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username flowable --dbname flowable <<-EOSQL
    CREATE SCHEMA AUTHORIZATION flowable;
    CREATE SCHEMA IF NOT EXISTS flw;
    CREATE SCHEMA IF NOT EXISTS acme;
EOSQL