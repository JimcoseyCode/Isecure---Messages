.class LO7/q$a$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/q$a;-><init>(LO7/q;LB8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LO7/q;

.field final synthetic h:LO7/q$a;


# direct methods
.method constructor <init>(LO7/q$a;LO7/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO7/q$a$c;->h:LO7/q$a;

    .line 2
    .line 3
    iput-object p2, p0, LO7/q$a$c;->g:LO7/q;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/q$a$c;->h:LO7/q$a;

    .line 2
    .line 3
    invoke-static {v0}, LO7/q$a;->k(LO7/q$a;)Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/q$a$c;->a()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
