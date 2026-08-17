.class public Le6/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Le6/b$a;->a:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a()Le6/b;
    .locals 6

    .line 1
    new-instance v0, Le6/b;

    .line 2
    .line 3
    iget v1, p0, Le6/b$a;->a:I

    .line 4
    .line 5
    iget-boolean v2, p0, Le6/b$a;->b:Z

    .line 6
    .line 7
    iget-object v3, p0, Le6/b$a;->c:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    invoke-direct/range {v0 .. v5}, Le6/b;-><init>(IZLjava/util/concurrent/Executor;Le6/d;Le6/e;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public varargs b(I[I)Le6/b$a;
    .locals 2

    .line 1
    iput p1, p0, Le6/b$a;->a:I

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :goto_0
    array-length v0, p2

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    aget v0, p2, p1

    .line 10
    .line 11
    iget v1, p0, Le6/b$a;->a:I

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    iput v0, p0, Le6/b$a;->a:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object p0
.end method
