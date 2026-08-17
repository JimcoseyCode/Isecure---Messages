.class LC8/T;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:LC8/v0;

.field private final h:Ljava/util/List;

.field private final i:LC8/r0;

.field private final j:Z


# direct methods
.method public constructor <init>(LC8/v0;Ljava/util/List;LC8/r0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC8/T;->g:LC8/v0;

    .line 5
    .line 6
    iput-object p2, p0, LC8/T;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, LC8/T;->i:LC8/r0;

    .line 9
    .line 10
    iput-boolean p4, p0, LC8/T;->j:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LC8/T;->g:LC8/v0;

    .line 2
    .line 3
    iget-object v1, p0, LC8/T;->h:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, LC8/T;->i:LC8/r0;

    .line 6
    .line 7
    iget-boolean v3, p0, LC8/T;->j:Z

    .line 8
    .line 9
    check-cast p1, LD8/g;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, LC8/V;->a(LC8/v0;Ljava/util/List;LC8/r0;ZLD8/g;)LC8/d0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
