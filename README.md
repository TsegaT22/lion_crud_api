Lions API: Tsega Takele
API Endpoints:
Base URL: http://localhost:8080/lions
/all (GET)
Gets a list of all the lions in the database.

    {
        "lionId": 8888,
        "name": "Grace",
        "description": "This lion is in rehabilitation.",
        "age": 8,
        "country": "Rwanda"
    },
    {
        "lionId": 8890,
        "name": "Hana",
        "description": "This lion is back in the wild.",
        "age": 8,
        "country": "Ethiopia"
    },
    {
        "lionId": 8891,
        "name": "pilipili",
        "description": "This lion is a cun and is in rehab.",
        "age": 1,
        "country": "Zimbabwe"
    }

/{lionId} (GET)
Fetches the I.D of lion in the database.

{
    "lionId": 8888,
    "name": "Grace",
    "description": "This lion is in rehabilitation.",
    "age": 8,
    "country": "Rwanda"
}

/name (GET)
Fetches the searched name of the lion in the database.

{
        "lionId": 8890,
        "name": "Hana",
        "description": "This lion is back in the wild.",
        "age": 8,
        "country": "Ethiopia"
    }

/country/{country} (GET)
Fetches lions from searched country in the database.

{
        "lionId": 8891,
        "name": "pilipili",
        "description": "This lion is a cun and is in rehab.",
        "age": 1,
        "country": "Zimbabwe"
    }
/old (GET)
Fetches lions who are considered old in the database.

{
        "lionId": 8890,
        "name": "Hana",
        "description": "This lion is back in the wild.",
        "age": 10,
        "country": "Ethiopia"
    }

/new (POST)
Adds a new lion to the database.

 {
        "lionId": 8892,
        "name": "Natasha",
        "description": "This lion is in rehabilitation.",
        "age": 5,
        "country": "India"
    }
/update (PUT)
Updates the information of a lion in the database.
{
"lionId": 8890,
        "name": "Hana",
        "description": "This lion is in rehabilitation.",
        "age": 10,
        "country": "Ethiopia"
        }
/delete (DELETE)
Deletes a lion in the database.

{
        "lionId": 8890,
        "name": "Hana",
        "description": "This lion is back in the wild.",
        "age": 10,
        "country": "Ethiopia"
    },
    {
        "lionId": 8891,
        "name": "pilipili",
        "description": "This lion is a cun and is in rehab.",
        "age": 1,
        "country": "Zimbabwe"
    },
    {
        "lionId": 8892,
        "name": "Natasha",
        "description": "This lion is in rehabilitation.",
        "age": 5,
        "country": "India"
    }
