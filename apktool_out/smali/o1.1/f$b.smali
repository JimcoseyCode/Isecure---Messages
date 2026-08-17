.class final Lo1/f$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/f;->d(Lo1/g;Lo1/d;Lo1/f;Ljava/util/concurrent/Executor;Lo1/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic g:Lo1/g;

.field final synthetic h:Lo1/d;

.field final synthetic i:Lo1/f;


# direct methods
.method constructor <init>(Lo1/c;Lo1/g;Lo1/d;Lo1/f;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lo1/f$b;->g:Lo1/g;

    .line 2
    .line 3
    iput-object p3, p0, Lo1/f$b;->h:Lo1/d;

    .line 4
    .line 5
    iput-object p4, p0, Lo1/f$b;->i:Lo1/f;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lo1/f$b;->h:Lo1/d;

    .line 2
    .line 3
    iget-object v1, p0, Lo1/f$b;->i:Lo1/f;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lo1/d;->a(Lo1/f;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lo1/f$b;->g:Lo1/g;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lo1/g;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 16
    iget-object v1, p0, Lo1/f$b;->g:Lo1/g;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lo1/g;->c(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_1
    iget-object v0, p0, Lo1/f$b;->g:Lo1/g;

    .line 23
    .line 24
    invoke-virtual {v0}, Lo1/g;->b()V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method
