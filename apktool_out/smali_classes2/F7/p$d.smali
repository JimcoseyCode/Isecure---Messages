.class public final LF7/p$d;
.super LF7/p;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:LF7/n$e;

.field private final b:LF7/n$e;


# direct methods
.method public constructor <init>(LF7/n$e;LF7/n$e;)V
    .locals 1

    .line 1
    const-string v0, "getterSignature"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, LF7/p;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LF7/p$d;->a:LF7/n$e;

    .line 11
    .line 12
    iput-object p2, p0, LF7/p$d;->b:LF7/n$e;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/p$d;->a:LF7/n$e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF7/n$e;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b()LF7/n$e;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/p$d;->a:LF7/n$e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LF7/n$e;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/p$d;->b:LF7/n$e;

    .line 2
    .line 3
    return-object v0
.end method
