.class public LX1/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW1/b;


# static fields
.field private static final i:Ljava/lang/Object;

.field private static j:LX1/l;

.field private static k:I


# instance fields
.field private a:LW1/d;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:J

.field private e:J

.field private f:Ljava/io/IOException;

.field private g:LW1/c$a;

.field private h:LX1/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX1/l;->i:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()LX1/l;
    .locals 3

    .line 1
    sget-object v0, LX1/l;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LX1/l;->j:LX1/l;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, LX1/l;->h:LX1/l;

    .line 9
    .line 10
    sput-object v2, LX1/l;->j:LX1/l;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput-object v2, v1, LX1/l;->h:LX1/l;

    .line 14
    .line 15
    sget v2, LX1/l;->k:I

    .line 16
    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    sput v2, LX1/l;->k:I

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-object v1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    new-instance v0, LX1/l;

    .line 27
    .line 28
    invoke-direct {v0}, LX1/l;-><init>()V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v1
.end method

.method private c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LX1/l;->a:LW1/d;

    .line 3
    .line 4
    iput-object v0, p0, LX1/l;->b:Ljava/lang/String;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    iput-wide v1, p0, LX1/l;->c:J

    .line 9
    .line 10
    iput-wide v1, p0, LX1/l;->d:J

    .line 11
    .line 12
    iput-wide v1, p0, LX1/l;->e:J

    .line 13
    .line 14
    iput-object v0, p0, LX1/l;->f:Ljava/io/IOException;

    .line 15
    .line 16
    iput-object v0, p0, LX1/l;->g:LW1/c$a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    sget-object v0, LX1/l;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, LX1/l;->k:I

    .line 5
    .line 6
    const/4 v2, 0x5

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-direct {p0}, LX1/l;->c()V

    .line 10
    .line 11
    .line 12
    sget v1, LX1/l;->k:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    sput v1, LX1/l;->k:I

    .line 17
    .line 18
    sget-object v1, LX1/l;->j:LX1/l;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v1, p0, LX1/l;->h:LX1/l;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    sput-object p0, LX1/l;->j:LX1/l;

    .line 28
    .line 29
    :cond_1
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
.end method

.method public d(LW1/d;)LX1/l;
    .locals 0

    .line 1
    iput-object p1, p0, LX1/l;->a:LW1/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public e(J)LX1/l;
    .locals 0

    .line 1
    iput-wide p1, p0, LX1/l;->d:J

    .line 2
    .line 3
    return-object p0
.end method

.method public f(J)LX1/l;
    .locals 0

    .line 1
    iput-wide p1, p0, LX1/l;->e:J

    .line 2
    .line 3
    return-object p0
.end method

.method public g(LW1/c$a;)LX1/l;
    .locals 0

    .line 1
    iput-object p1, p0, LX1/l;->g:LW1/c$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public h(Ljava/io/IOException;)LX1/l;
    .locals 0

    .line 1
    iput-object p1, p0, LX1/l;->f:Ljava/io/IOException;

    .line 2
    .line 3
    return-object p0
.end method

.method public i(J)LX1/l;
    .locals 0

    .line 1
    iput-wide p1, p0, LX1/l;->c:J

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Ljava/lang/String;)LX1/l;
    .locals 0

    .line 1
    iput-object p1, p0, LX1/l;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
