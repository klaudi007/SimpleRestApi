Simple Rest API


Territory API

Territory SAVE
Request: [Territory]

POST: {{API-URL}}/territory/save Header: X-Auth-Token: ... Body: { "type": "300", "territoryLevel" : "250", "name": "Ankara" }

Response: [Territory]

{ "id": 12, "systemStartDate": null, "systemEndDate": null, "urisId": null, "type": 300, "name": "Ankara", "parentId": null, "territoryLevel": 250, "polygon": null, "observations": null }



Get Territories
- Request :

    POST: {{API-URL}}/territory/all
    Header: X-Auth-Token: ...
- Response : List of [Territory]

[
    {
        "id": 1,
        "systemStartDate": null,
        "systemEndDate": null,
        "urisId": null,
        "type": 300,
        "name": "Ankara",
        "parentId": null,
        "territoryLevel": 250,
        "polygon": null,
        "observations": []
    },
    {
        "id": 3,
        "systemStartDate": null,
        "systemEndDate": null,
        "urisId": null,
        "type": 300,
        "name": "Ankara 2",
        "parentId": null,
        "territoryLevel": 250,
        "polygon": null,
        "observations": []
    },
    {
        "id": 4,
        "systemStartDate": null,
        "systemEndDate": null,
        "urisId": null,
        "type": 400,
        "name": "Ankara",
        "parentId": null,
        "territoryLevel": 250,
        "polygon": null,
        "observations": []
    }
]






Plan API
Save New Plan
- Request : [Plan]

    POST: {{API-URL}}/soilSurvey/plan/savePlan
    Header: X-Auth-Token: ...
    Body: 
    {
      "territory": {
        "id": 1
      },
      "documents": [{
        "name": "test",
        "asdisCode":28,
        "documentType":"FERMAN"
      },{
        "name": "test2",
        "asdisCode":21,
        "documentType":"FERMAN"
      }],
      "budget": "123",
      "systemStartDate": "1",
      "systemEndDate": "2"
    }
Response : [Plan]

{
  "id": 6,
  "systemStartDate": 1,
  "systemEndDate": 2,
  "territory": {
    "id": 1,
    "systemStartDate": null,
    "systemEndDate": null,
    "urisId": null,
    "type": 300,
    "name": "Ankara",
    "parentId": null,
    "territoryLevel": 250,
    "polygon": null,
    "observations": []
  },
  "documents": [
    {
      "id": 8,
      "name": "test",
      "documentType": "FERMAN",
      "asdisCode": 1233
    },
    {
      "id": 9,
      "name": "test2",
      "documentType": "FERMAN",
      "asdisCode": 1234
    }
  ],
  "budget": 123
}
Get all Plans
- Request :

    POST: {{API-URL}}/soilSurvey/plan/all
    Header: X-Auth-Token: ...
- Response: List of [Plan]

    [
      {
        "id": 1,
        "systemStartDate": 1,
        "systemEndDate": 2,
        "territory": {
          "id": 1,
          "systemStartDate": null,
          "systemEndDate": null,
          "urisId": null,
          "type": 300,
          "name": "Ankara",
          "parentId": null,
          "territoryLevel": 250,
          "polygon": null,
          "observations": []
        },
        "documents": [
          {
            "id": 1,
            "name": "test",
            "documentType": "FERMAN",
            "asdisCode": 28
          },
          {
            "id": 2,
            "name": "test2",
            "documentType": "FERMAN",
            "asdisCode": 21
          }
        ],
        "budget": 123
      },
      {
        "id": 3,
        "systemStartDate": 1,
        "systemEndDate": 2,
        "territory": {
          "id": 1,
          "systemStartDate": null,
          "systemEndDate": null,
          "urisId": null,
          "type": 300,
          "name": "Ankara",
          "parentId": null,
          "territoryLevel": 250,
          "polygon": null,
          "observations": []
        },
        "documents": [
          {
            "id": 4,
            "name": "test",
            "documentType": "FERMAN",
            "asdisCode": 321
          },
          {
            "id": 5,
            "name": "test2",
            "documentType": "FERMAN",
            "asdisCode": 123
          }
        ],
        "budget": 123
      },
      {
        "id": 6,
        "systemStartDate": 1,
        "systemEndDate": 2,
        "territory": {
          "id": 1,
          "systemStartDate": null,
          "systemEndDate": null,
          "urisId": null,
          "type": 300,
          "name": "Ankara",
          "parentId": null,
          "territoryLevel": 250,
          "polygon": null,
          "observations": []
        },
        "documents": [
          {
            "id": 8,
            "name": "test",
            "documentType": "FERMAN",
            "asdisCode": 1233
          },
          {
            "id": 9,
            "name": "test2",
            "documentType": "FERMAN",
            "asdisCode": 1234
          }
        ],
        "budget": 123
      }
    ]
Get Plan By ID
Request : [Plan].id

POST: {{API-URL}}/soilSurvey/plan/1
Header: X-Auth-Token: ...
Response: [Plan]

{
  "id": 1,
  "systemStartDate": 1,
  "systemEndDate": 2,
  "territory": {
    "id": 1,
    "systemStartDate": null,
    "systemEndDate": null,
    "urisId": null,
    "type": 300,
    "name": "Ankara",
    "parentId": null,
    "territoryLevel": 250,
    "polygon": null,
    "observations": []
  },
  "documents": [
    {
      "id": 1,
      "name": "test",
      "documentType": "FERMAN",
      "asdisCode": 28
    },
    {
      "id": 2,
      "name": "test2",
      "documentType": "FERMAN",
      "asdisCode": 21
    }
  ],
  "budget": 123
}
