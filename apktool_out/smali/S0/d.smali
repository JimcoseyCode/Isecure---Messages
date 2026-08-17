.class LS0/d;
.super LS0/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private b:Landroid/content/Context;

.field private c:Landroid/net/Uri;


# direct methods
.method constructor <init>(LS0/a;Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LS0/a;-><init>(LS0/a;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LS0/d;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, LS0/d;->c:Landroid/net/Uri;

    .line 7
    .line 8
    return-void
.end method

.method private static r(Ljava/lang/AutoCloseable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Lq/o;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    return-void

    .line 7
    :catch_1
    move-exception p0

    .line 8
    throw p0

    .line 9
    :cond_0
    return-void
.end method

.method private static s(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p1, p2, p3}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public b()Z
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->b(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public c(Ljava/lang/String;)LS0/a;
    .locals 3

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    const-string v2, "vnd.android.document/directory"

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, LS0/d;->s(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v0, LS0/d;

    .line 14
    .line 15
    iget-object v1, p0, LS0/d;->b:Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1, p1}, LS0/d;-><init>(LS0/a;Landroid/content/Context;Landroid/net/Uri;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)LS0/a;
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, LS0/d;->s(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p2, LS0/d;

    .line 12
    .line 13
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 14
    .line 15
    invoke-direct {p2, p0, v0, p1}, LS0/d;-><init>(LS0/a;Landroid/content/Context;Landroid/net/Uri;)V

    .line 16
    .line 17
    .line 18
    return-object p2

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public e()Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return v0

    .line 14
    :catch_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public f()Z
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->d(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->e(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->g(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public l()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LS0/d;->c:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Z
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->h(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public n()Z
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->i(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public o()J
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->j(Landroid/content/Context;Landroid/net/Uri;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public p()J
    .locals 2

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, LS0/b;->k(Landroid/content/Context;Landroid/net/Uri;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public q()[LS0/a;
    .locals 10

    .line 1
    iget-object v0, p0, LS0/d;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v0, p0, LS0/d;->c:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-static {v0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v0, v2}, Landroid/provider/DocumentsContract;->buildChildDocumentsUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v7, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    :try_start_0
    const-string v0, "document_id"

    .line 25
    .line 26
    filled-new-array {v0}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, p0, LS0/d;->c:Landroid/net/Uri;

    .line 48
    .line 49
    invoke-static {v1, v0}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_5

    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto :goto_2

    .line 61
    :cond_0
    :goto_1
    invoke-static {v9}, LS0/d;->r(Ljava/lang/AutoCloseable;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :goto_3
    new-array v0, v8, [Landroid/net/Uri;

    .line 70
    .line 71
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, [Landroid/net/Uri;

    .line 76
    .line 77
    array-length v1, v0

    .line 78
    new-array v1, v1, [LS0/a;

    .line 79
    .line 80
    :goto_4
    array-length v2, v0

    .line 81
    if-ge v8, v2, :cond_1

    .line 82
    .line 83
    new-instance v2, LS0/d;

    .line 84
    .line 85
    iget-object v3, p0, LS0/d;->b:Landroid/content/Context;

    .line 86
    .line 87
    aget-object v4, v0, v8

    .line 88
    .line 89
    invoke-direct {v2, p0, v3, v4}, LS0/d;-><init>(LS0/a;Landroid/content/Context;Landroid/net/Uri;)V

    .line 90
    .line 91
    .line 92
    aput-object v2, v1, v8

    .line 93
    .line 94
    add-int/lit8 v8, v8, 0x1

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_1
    return-object v1

    .line 98
    :goto_5
    invoke-static {v9}, LS0/d;->r(Ljava/lang/AutoCloseable;)V

    .line 99
    .line 100
    .line 101
    throw v0
.end method
