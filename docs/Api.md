# Jadwiga API

Jadwiga API delivers an endpoint you can use to talk with Jadwiga.

## Data types

There's only a single data type used in communication with Jadwiga:

* Message.

### Message

Message data type wraps a sentence or phrase in a natural language.

Fields:
- `message` - natural language phrase

**Example**

```json
{
  "message": "Hello, world!"
}
```

## Endpoints

There's a list of Jadwiga API's endpoints:
- `reply`

### `reply`

Send a message to Jadwiga and get a reply. 

**Request**

```
POST reply
```

Body: Message 

**Result**

Message

**Example**

Request:

```
POST reply
```

```json
{
  "message": "How are you?"
}
```

Response:

```json
{
  "message": "I'm fine."
}
```
