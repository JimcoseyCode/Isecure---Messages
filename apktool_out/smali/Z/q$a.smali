.class public final LZ/q$a;
.super LZ/s$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final b:LZ/q$b$a;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    new-instance v0, LZ/f$b;

    .line 2
    .line 3
    invoke-direct {v0}, LZ/f$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, LZ/s$a;-><init>(LZ/s$b$a;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "File can\'t be null."

    .line 10
    .line 11
    invoke-static {p1, v0}, LH0/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LZ/s$a;->a:LZ/s$b$a;

    .line 15
    .line 16
    check-cast v0, LZ/q$b$a;

    .line 17
    .line 18
    iput-object v0, p0, LZ/q$a;->b:LZ/q$b$a;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LZ/q$b$a;->d(Ljava/io/File;)LZ/q$b$a;

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public bridge synthetic a(J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, LZ/s$a;->a(J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, LZ/s$a;->b(J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c()LZ/q;
    .locals 2

    .line 1
    new-instance v0, LZ/q;

    .line 2
    .line 3
    iget-object v1, p0, LZ/q$a;->b:LZ/q$b$a;

    .line 4
    .line 5
    invoke-virtual {v1}, LZ/q$b$a;->c()LZ/q$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, LZ/q;-><init>(LZ/q$b;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
