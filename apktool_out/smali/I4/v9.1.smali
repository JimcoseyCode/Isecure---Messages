.class public final synthetic LI4/v9;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:LI4/x9;

.field public final synthetic h:LI4/M6;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:J

.field public final synthetic k:Lh6/j;


# direct methods
.method public synthetic constructor <init>(LI4/x9;LI4/M6;Ljava/lang/Object;JLh6/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI4/v9;->g:LI4/x9;

    .line 5
    .line 6
    iput-object p2, p0, LI4/v9;->h:LI4/M6;

    .line 7
    .line 8
    iput-object p3, p0, LI4/v9;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iput-wide p4, p0, LI4/v9;->j:J

    .line 11
    .line 12
    iput-object p6, p0, LI4/v9;->k:Lh6/j;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, LI4/v9;->g:LI4/x9;

    .line 2
    .line 3
    iget-object v1, p0, LI4/v9;->h:LI4/M6;

    .line 4
    .line 5
    iget-object v2, p0, LI4/v9;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iget-wide v3, p0, LI4/v9;->j:J

    .line 8
    .line 9
    iget-object v5, p0, LI4/v9;->k:Lh6/j;

    .line 10
    .line 11
    invoke-virtual/range {v0 .. v5}, LI4/x9;->h(LI4/M6;Ljava/lang/Object;JLh6/j;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
