.class LJ/p$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/p;->d(Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LJ/p;


# direct methods
.method constructor <init>(LJ/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ/p$b;->g:LJ/p;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ/p$b;->g:LJ/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, LJ/p;->h:Ljava/util/List;

    .line 5
    .line 6
    iput-object v1, v0, LJ/p;->g:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method
