.class public LY2/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lg2/a$c;


# direct methods
.method public constructor <init>(La3/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY2/a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, LY2/a$a;-><init>(LY2/a;La3/a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LY2/a;->a:Lg2/a$c;

    .line 10
    .line 11
    return-void
.end method

.method static bridge synthetic a(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LY2/a;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static d(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public b(Ljava/io/Closeable;)Lg2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/a;->a:Lg2/a$c;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg2/a;->i0(Ljava/io/Closeable;Lg2/a$c;)Lg2/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/lang/Object;Lg2/h;)Lg2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/a;->a:Lg2/a$c;

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lg2/a;->y0(Ljava/lang/Object;Lg2/h;Lg2/a$c;)Lg2/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
