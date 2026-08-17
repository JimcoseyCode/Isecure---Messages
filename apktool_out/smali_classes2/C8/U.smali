.class LC8/U;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final g:LC8/v0;

.field private final h:Ljava/util/List;

.field private final i:LC8/r0;

.field private final j:Z

.field private final k:Lv8/k;


# direct methods
.method public constructor <init>(LC8/v0;Ljava/util/List;LC8/r0;ZLv8/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC8/U;->g:LC8/v0;

    .line 5
    .line 6
    iput-object p2, p0, LC8/U;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, LC8/U;->i:LC8/r0;

    .line 9
    .line 10
    iput-boolean p4, p0, LC8/U;->j:Z

    .line 11
    .line 12
    iput-object p5, p0, LC8/U;->k:Lv8/k;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LC8/U;->g:LC8/v0;

    .line 2
    .line 3
    iget-object v1, p0, LC8/U;->h:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, LC8/U;->i:LC8/r0;

    .line 6
    .line 7
    iget-boolean v3, p0, LC8/U;->j:Z

    .line 8
    .line 9
    iget-object v4, p0, LC8/U;->k:Lv8/k;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    check-cast v5, LD8/g;

    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, LC8/V;->b(LC8/v0;Ljava/util/List;LC8/r0;ZLv8/k;LD8/g;)LC8/d0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
