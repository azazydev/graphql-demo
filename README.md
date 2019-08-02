# graphql-demo
demonstrate the usage of graphql 
# Usage
     query {
      recentPosts(count: 10, offset: 0) {
          id
          title
          category
          author {
              id
              name
              thumbnail
         }
      }
    }
