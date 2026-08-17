.class public final synthetic Lc6/z;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lc6/k;

.field public final synthetic h:LP4/a;

.field public final synthetic i:LP4/b;

.field public final synthetic j:Ljava/util/concurrent/Callable;

.field public final synthetic k:LP4/m;


# direct methods
.method public synthetic constructor <init>(Lc6/k;LP4/a;LP4/b;Ljava/util/concurrent/Callable;LP4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc6/z;->g:Lc6/k;

    .line 5
    .line 6
    iput-object p2, p0, Lc6/z;->h:LP4/a;

    .line 7
    .line 8
    iput-object p3, p0, Lc6/z;->i:LP4/b;

    .line 9
    .line 10
    iput-object p4, p0, Lc6/z;->j:Ljava/util/concurrent/Callable;

    .line 11
    .line 12
    iput-object p5, p0, Lc6/z;->k:LP4/m;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc6/z;->g:Lc6/k;

    .line 2
    .line 3
    iget-object v1, p0, Lc6/z;->h:LP4/a;

    .line 4
    .line 5
    iget-object v2, p0, Lc6/z;->i:LP4/b;

    .line 6
    .line 7
    iget-object v3, p0, Lc6/z;->j:Ljava/util/concurrent/Callable;

    .line 8
    .line 9
    iget-object v4, p0, Lc6/z;->k:LP4/m;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3, v4}, Lc6/k;->g(LP4/a;LP4/b;Ljava/util/concurrent/Callable;LP4/m;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
